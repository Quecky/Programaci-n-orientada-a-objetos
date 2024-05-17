package clase5.ejerciciomesa1;

import clase5.ejerciciomesa1.db.H2Connection;
import clase5.ejerciciomesa1.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;

public class Main {

    public static Logger LOGGER = Logger.getLogger(Main.class);
    public static String SQL_CREATE = "DROP TABLE IF EXISTS ODONTOLOGOS;"+
            "CREATE TABLE ODONTOLOGOS( NOMBRE VARCHAR(50) NOT NULL,"+
            "APELLIDO VARCHAR(50) NOT NULL, MATRICULA VARCHAR(50) NOT NULL)";

    public static String SQL_INSERT = "INSERT INTO ODONTOLOGOS VALUES(?,?,?)";
    public static String SQL_SELECT="SELECT * FROM ODONTOLOGOS";

    public static String SQL_UPDATE="UPDATE ODONTOLOGOS SET MATRICULA=? WHERE NOMBRE=?";
    public static void main(String[] args) {
        Connection connection = null;
        Odontologo odon = new Odontologo("Abner", "Cedillo", "1000");
        Odontologo odontdeDB = null;
        try {
            connection = H2Connection.getConnection();
            Statement statement = connection.createStatement();
            //CREAMOS LA TABLA FIGURAS
            statement.execute(SQL_CREATE);
            //INSERTAR DATOS EN LA TABLA
            PreparedStatement preparedStatment = connection.prepareStatement(SQL_INSERT);
            preparedStatment.setString(1, odon.getNombre());
            LOGGER.debug("odon.getNombre() "+odon.getNombre());
            preparedStatment.setString(2, odon.getApellido());
            preparedStatment.setString(3, odon.getMatricula());
            preparedStatment.executeUpdate();
            //consultar todos los datos
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);

            while (resultSet.next()) {

                String nombre = resultSet.getString(1);
                String apellido = resultSet.getString(2);
                String matricula = resultSet.getString(3);
                odontdeDB = new Odontologo(nombre, apellido, matricula);

            }

            LOGGER.info("Datos del odontologo: " + odontdeDB);

            //update
            //statement.execute(SQL_DELETE);
            //LOGGER.info("--------------------------------");
            preparedStatment = connection.prepareStatement(SQL_UPDATE);
            preparedStatment.setString(1, "333333");
            preparedStatment.setString(2, odon.getNombre());
            preparedStatment.executeUpdate();
            odon.setMatricula("333333");


            resultSet = statement.executeQuery(SQL_SELECT);

            while (resultSet.next()) {
                String nombre = resultSet.getString(1);
                String apellido = resultSet.getString(2);
                String matricula = resultSet.getString(3);
                odontdeDB = new Odontologo(nombre, apellido, matricula);

            }
            LOGGER.info("Datos del odontologo: " + odontdeDB);

        } catch (Exception e) {
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
    }
}
