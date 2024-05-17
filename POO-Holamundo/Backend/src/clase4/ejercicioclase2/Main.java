package clase4.ejercicioclase2;

import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    public static Logger LOGGER = Logger.getLogger(Main.class);
    public static String SQL_CREATE = "DROP TABLE IF EXISTS ANIMALS;"+
            "CREATE TABLE ANIMALS(ID INT AUTO_INCREMENT PRIMARY KEY,"+
            "TIPO VARCHAR(50) NOT NULL, NOMBRE VARCHAR(50) NOT NULL)";

    public static String SQL_INSERT = "INSERT INTO ANIMALS VALUES(DEFAULT, 'perro','Odin'),"+
            "(DEFAULT, 'gato','Ñaña'),(DEFAULT, 'pez','Julia'),(DEFAULT, 'pez','Doris'), "+
            "(DEFAULT, 'sapo','Pepe')";

    public static String SQL_SELECT="SELECT * FROM ANIMALS";
    public static String SQL_DELETE ="DELETE FROM ANIMALS WHERE ID=5";

    public static void main(String[] args) {
        Connection connection=null;
        try{
            connection=getConnection();
            Statement statement = connection.createStatement();
            //CREAMOS LA TABLA ANIMALES
            statement.execute(SQL_CREATE);
            //INSERTAR DATOS EN LA TABLA
            statement.execute(SQL_INSERT);
            //consultar todos los datos
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);

            while(resultSet.next())
            {
                LOGGER.info("Animal: "+resultSet.getInt(1)+" - "+
                resultSet.getString(2)+" - "+resultSet.getString(3));
            }

            //eliminar un animal
            statement.execute(SQL_DELETE);
            LOGGER.info("--------------------------------");

           resultSet = statement.executeQuery(SQL_SELECT);
            while(resultSet.next())
            {
                LOGGER.info("Animal: "+resultSet.getInt(1)+" - "+
                        resultSet.getString(2)+" - "+resultSet.getString(3));
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

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:~/clase8","SA","SA");
    }
}
