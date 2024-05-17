package clase6.ejercicioIntegrador.impl;

import clase6.ejercicioIntegrador.dao.IDao;
import clase6.ejercicioIntegrador.db.H2Connection;
import clase6.ejercicioIntegrador.model.Domicilio;
import clase6.ejercicioIntegrador.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PacienteDaiH2 implements IDao<Paciente> {
    private static String SQL_SELECT_ALL="SELECT * FROM PACIENTES";
    private static String SQL_SELECT_ID = "SELECT * FROM PACIENTES WHERE ID=?";
    private static String SQL_INSERT="INSERT INTO PACIENTES VALUES(DEFAULT,?,?,?,?,?)";
    private static Logger LOGGER = Logger.getLogger(PacienteDaiH2.class);
    @Override
    public Paciente registrar(Paciente paciente) throws SQLException {
        Paciente pacienteAretornar=null;//este es el que tiene ID
        Connection connection = null;
        DomicilioDaoH2 domicilioDaoH2 = new DomicilioDaoH2();
        try{
            connection = H2Connection.getConnection();
            connection.setAutoCommit(false);
            Domicilio domicilioGuardado=domicilioDaoH2.registrar(paciente.getDomicilio());


            PreparedStatement preparedStatement =connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,paciente.getApellido());
            preparedStatement.setString(2,paciente.getNombre());
            preparedStatement.setString(3,paciente.getDni());
            preparedStatement.setDate(4, Date.valueOf(paciente.getFechaIngreso()));
            preparedStatement.setInt(5,domicilioGuardado.getId());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            while(resultSet.next())
            {
                Integer id = resultSet.getInt(1);
                pacienteAretornar=new Paciente(id,paciente.getApellido(),paciente.getNombre(),paciente.getDni(),paciente.getFechaIngreso(),domicilioGuardado);

            }

            LOGGER.info("Paciente persistido "+pacienteAretornar);
            //el commit es para hacer modificaciones en la BD
            //no se necesita para listar
            connection.commit();

            connection.setAutoCommit(true);

        }catch(Exception e)
        {
            if(connection!=null)
            {
                try{
                    connection.rollback();
                }catch(SQLException ex)
                {
                    LOGGER.info(e.getMessage());
                    e.printStackTrace();
                }
            }
            LOGGER.info(e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            try
            {
                connection.close();
            }catch(SQLException e)
            {
                LOGGER.info(e.getMessage());
                e.printStackTrace();
            }

        }


        return pacienteAretornar;
    }

    @Override
    public Paciente buscarPorID(Integer id) throws SQLException {
        Connection connection = null;
        Paciente pacienteEncontrado=null;
        DomicilioDaoH2 domiclioDaoH2 = new DomicilioDaoH2();
        try
        {
            connection= H2Connection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Integer IdDevuelto = resultSet.getInt(1);
                String apellido=resultSet.getString(2);
                String nombre=resultSet.getString(3);
                String dni=resultSet.getString(4);
                LocalDate fecha=resultSet.getDate(5).toLocalDate();
                Integer idDomiclio = resultSet.getInt(6);

                Domicilio domiclioEncontrado= domiclioDaoH2.buscarPorID(idDomiclio);
                pacienteEncontrado = new Paciente(IdDevuelto,apellido,nombre,dni,fecha,domiclioEncontrado );

                LOGGER.info("paciente encontrado "+pacienteEncontrado);
            }

        }catch(Exception e)
        {

            LOGGER.info(e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            connection.close();
        }

        return pacienteEncontrado;
    }

    @Override
    public List<Paciente> buscarTodos() throws SQLException {
        List<Paciente> pacientes=new ArrayList<>();
        DomicilioDaoH2 domiclioDaoH2 = new DomicilioDaoH2();
        Connection connection = null;
        try
        {
            connection = H2Connection.getConnection();
            Statement statment = connection.createStatement();
            ResultSet resultSet = statment.executeQuery(SQL_SELECT_ALL);
            while(resultSet.next())
            {
                Integer IdDevuelto = resultSet.getInt(1);
                String apellido=resultSet.getString(2);
                String nombre=resultSet.getString(3);
                String dni=resultSet.getString(4);
                LocalDate fecha=resultSet.getDate(5).toLocalDate();
                Integer idDomiclio = resultSet.getInt(6);
                Domicilio domiclioEncontrado= domiclioDaoH2.buscarPorID(idDomiclio);
                Paciente paciente = new Paciente(IdDevuelto,apellido,nombre,dni,fecha,domiclioEncontrado );
                LOGGER.info("Paciente listado "+paciente);
                pacientes.add(paciente);

            }

        }catch(Exception e)
        {

            LOGGER.info(e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            connection.close();
        }


        return pacientes;
    }
}
