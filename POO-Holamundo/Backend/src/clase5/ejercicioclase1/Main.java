package clase5.ejercicioclase1;

import clase5.ejercicioclase1.db.H2Connection;
import clase5.ejercicioclase1.model.Cuenta;
import org.apache.log4j.Logger;

import java.sql.*;


public class Main {
    public static Logger LOGGER = Logger.getLogger(Main.class);
    public static String SQL_CREATE = "DROP TABLE IF EXISTS CUENTAS;"+
            "CREATE TABLE CUENTAS(ID INT AUTO_INCREMENT PRIMARY KEY, NROCUENTA INT NOT NULL,"+
        "NOMBRE VARCHAR(50) NOT NULL, SALDO NUMERIC(7,2) NOT NULL)";

    public static String SQL_INSERT = "INSERT INTO CUENTAS VALUES(DEFAULT,?,?,?)";
    public static String SQL_SELECT="SELECT * FROM CUENTAS";

    public static String SQL_UPDATE="UPDATE CUENTAS SET SALDO=? WHERE NROCUENTA=?";
    public static String SQL_SELECT_ALL="";
    public static void main(String[] args) {
        Connection connection = null;
        Cuenta cuenta = new Cuenta(1234,"ceunta MP",1000);
        Cuenta cuentadesdeDB = null;
        try{
            connection= H2Connection.getConnection();
            Statement statement = connection.createStatement();
            //CREAMOS LA TABLA FIGURAS
            statement.execute(SQL_CREATE);
            //INSERTAR DATOS EN LA TABLA
            PreparedStatement preparedStatment =connection.prepareStatement(SQL_INSERT);
            preparedStatment.setInt(1,cuenta.getNroCuenta());
            preparedStatment.setString(2, cuenta.getNombre());
            preparedStatment.setDouble(3, cuenta.getSaldo());
            preparedStatment.executeUpdate();
            //consultar todos los datos
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);

            while(resultSet.next())
            {
                Integer id= resultSet.getInt(1);
                Integer nroCuenta = resultSet.getInt(2);
                String nombre= resultSet.getString(3);
                double saldo=resultSet.getDouble(4);
                cuentadesdeDB = new Cuenta(id,nroCuenta,nombre,saldo);

            }

            LOGGER.info("Datos de la cuenta: "+cuentadesdeDB);

            //update
            //statement.execute(SQL_DELETE);
            //LOGGER.info("--------------------------------");
            preparedStatment = connection.prepareStatement(SQL_UPDATE);
            preparedStatment.setDouble(1,cuenta.getSaldo()+10);
            preparedStatment.setInt(2,cuenta.getNroCuenta());
            preparedStatment.executeUpdate();
            cuenta.setSaldo(cuenta.getSaldo()+10);

           //update de cuenta
            connection.setAutoCommit(false);
            try
            {
                PreparedStatement prepare = connection.prepareStatement(SQL_UPDATE);
                preparedStatment.setDouble(1,cuenta.getSaldo()+10);
                preparedStatment.setInt(2,cuenta.getNroCuenta());
                preparedStatment.executeUpdate();
                int nuv=10/0;
                connection.commit();
                cuenta.setSaldo(cuenta.getSaldo()+15);

            }catch(Exception e){
               connection.rollback();
                LOGGER.error(e.getMessage());
            }
            connection.setAutoCommit(true);
            resultSet = statement.executeQuery(SQL_SELECT);

            while(resultSet.next())
            {
                Integer id= resultSet.getInt(1);
                Integer nroCuenta = resultSet.getInt(2);
                String nombre= resultSet.getString(3);
                double saldo=resultSet.getDouble(4);
                cuentadesdeDB = new Cuenta(id,nroCuenta,nombre,saldo);

            }

        }catch(Exception e)
        {
            e.printStackTrace();
            LOGGER.error(e.getMessage());

        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                LOGGER.error(e.getMessage());

            }
        }

    }
}
