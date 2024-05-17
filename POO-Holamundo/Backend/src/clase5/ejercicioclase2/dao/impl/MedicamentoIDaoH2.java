package clase5.ejercicioclase2.dao.impl;

import clase5.ejercicioclase2.dao.IDao;
import clase5.ejercicioclase2.db.H2Connection;
import clase5.ejercicioclase2.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.*;

public class MedicamentoIDaoH2 implements IDao<Medicamento> {
   public static Logger LOGGER = Logger.getLogger(MedicamentoIDaoH2.class);
   public static String SQL_INSERT="INSERT INTO MEDICAMENTOS VALUES(DEFAULT,?,?,?,?,?)";
    public static String SQL_SELECT="SELECT * FROM MEDICAMENTOS";
   @Override
    public Medicamento registrar(Medicamento medicamento) {
        Connection connection = null;
        Medicamento medicamentoRetornar=null;
        try {
            connection = H2Connection.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1,medicamento.getCodigo());
            preparedStatement.setString(2,medicamento.getNombre());
            preparedStatement.setString(3,medicamento.getLabortatorio());
            preparedStatement.setInt(4,medicamento.getCantidad());
            preparedStatement.setDouble(5,medicamento.getPrecio());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while(resultSet.next())
            {
                Integer id = resultSet.getInt(1);
                medicamentoRetornar=new Medicamento(id, medicamento.getCodigo(), medicamento.getNombre(),medicamento.getLabortatorio(),medicamento.getCantidad(),medicamento.getPrecio());
            }



            connection.commit();
            connection.setAutoCommit(true);



            //LOGGER.info("Datos del odontologo: " );

        } catch (Exception e) {
            if(connection!=null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    e.printStackTrace();
                    LOGGER.error(e.getMessage());
                }
            }
            e.printStackTrace();
            LOGGER.error(e.getMessage());

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                LOGGER.error(e.getMessage());

            }
        }

        return medicamentoRetornar;
    }

    @Override
    public Medicamento buscarPorCampo(String campo) {
        Connection connection = null;
        Medicamento medicamentoRetornar=null;
        try {
            connection=H2Connection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT);
            preparedStatement.setString(1,campo.toUpperCase());
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Integer id=resultSet.getInt(1);
                Integer codigo=resultSet.getInt(2);
                String nombre=resultSet.getString(3);
                String lab=resultSet.getString(4);
                int cantidad=resultSet.getInt(5);
                double precio=resultSet.getDouble(6);
                medicamentoRetornar = new Medicamento(id,codigo,nombre,lab,cantidad,precio);
            }

            LOGGER.info("El medicamento encontrado es: " +medicamentoRetornar);

        } catch (Exception e) {
            if(connection!=null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    e.printStackTrace();
                    LOGGER.error(e.getMessage());
                }
            }
            e.printStackTrace();
            LOGGER.error(e.getMessage());

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                LOGGER.error(e.getMessage());

            }
        }



        return medicamentoRetornar;
    }

    @Override
    public Medicamento buscarPorid(Integer id) {
        return null;
    }
}
