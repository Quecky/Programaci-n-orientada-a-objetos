package clase6.ejercicioIntegrador.impl;

import clase6.ejercicioIntegrador.dao.IDao;
import clase6.ejercicioIntegrador.db.H2Connection;
import clase6.ejercicioIntegrador.model.Domicilio;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.List;

public class DomicilioDaoH2 implements IDao<Domicilio> {
private static Logger LOGGER = Logger.getLogger(DomicilioDaoH2.class);
    private static String SQL_INSERT = "INSERT INTO DOMICILIOS VALUES(DEFAULT,?,?,?,?)";
    private static String SQL_SELECT_ID="SELECT * FROM DOMICILIOS WHERE ID=?";


    @Override
    public Domicilio registrar(Domicilio domicilio) throws SQLException {
        Domicilio domicilioAretornar=null;//este es el que tiene ID
        Connection connection = null;
        try{
            connection = H2Connection.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,domicilio.getCalle());
            preparedStatement.setInt(2,domicilio.getNumero());
            preparedStatement.setString(3,domicilio.getLocalidad());
            preparedStatement.setString(4,domicilio.getProvincia());
            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next())
            {
                Integer id = resultSet.getInt(1);
                domicilioAretornar = new Domicilio(id,domicilio.getCalle(),domicilio.getNumero(),domicilio.getLocalidad(),domicilio.getProvincia());
            }
            LOGGER.info("Paciente persistido "+domicilioAretornar);
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
            connection.close();
        }

        return domicilioAretornar;
    }

    @Override
    public Domicilio buscarPorID(Integer id) {
        Connection connection =null;
        Domicilio domicilioencontrado=null;
        try
        {
            connection=H2Connection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(SQL_SELECT_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Integer idEncontrado=resultSet.getInt(1);
                String calle =resultSet.getString(2);
                int numero=resultSet.getInt(3);
                String localidad=resultSet.getString(4);
                String provincia=resultSet.getString(5);
                domicilioencontrado=new Domicilio(idEncontrado,calle,numero,localidad,provincia);
            }
            LOGGER.info("Domicilio encontrado "+domicilioencontrado);


        }catch(Exception e)
    {

        LOGGER.info(e.getMessage());
        e.printStackTrace();
    }
        finally
    {
        try
        {
            connection.close() ;
        }catch(SQLException ex)
        {
            LOGGER.info(ex.getMessage());
            ex.printStackTrace();
        }
       ;
    }
        return domicilioencontrado;
    }

    @Override
    public List<Domicilio> buscarTodos() {
        return null;
        //esto no lo vamos usar
    }
}
