package clase4.ejerciciomesas;

import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    public static Logger LOGGER = Logger.getLogger(Main.class);
    public static String SQL_CREATE = "DROP TABLE IF EXISTS FIGURAS;"+
            "CREATE TABLE FIGURAS(ID INT AUTO_INCREMENT PRIMARY KEY,"+
            "TIPO VARCHAR(50) NOT NULL, COLOR VARCHAR(50) NOT NULL)";

    public static String SQL_INSERT = "INSERT INTO FIGURAS VALUES(DEFAULT, 'circulo','rojo'),"+
            "(DEFAULT, 'circulo','verde'),(DEFAULT, 'cuadrado','amarillo'),(DEFAULT, 'cuadrado','azul'), "+
            "(DEFAULT, 'cuadrado','negro')";

    public static String SQL_SELECT="SELECT * FROM FIGURAS WHERE COLOR='rojo' AND TIPO='circulo'";
    //public static String SQL_DELETE ="DELETE FROM ANIMALS WHERE ID=5";
    public static String SQL_SELECT_ALL="SELECT * FROM FIGURAS";
    public static void main(String[] args) {
        Connection connection=null;
        try{
            connection=getConnection();
            Statement statement = connection.createStatement();
            //CREAMOS LA TABLA FIGURAS
            statement.execute(SQL_CREATE);
            //INSERTAR DATOS EN LA TABLA
            statement.execute(SQL_INSERT);
            //consultar todos los datos
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);

            while(resultSet.next())
            {
                LOGGER.info("Figura: "+resultSet.getInt(1)+" - "+
                resultSet.getString(2)+" - "+resultSet.getString(3));
            }

            //eliminar un animal
            //statement.execute(SQL_DELETE);
            LOGGER.info("--------------------------------");


            resultSet = statement.executeQuery(SQL_SELECT_ALL);

            while(resultSet.next())
            {
                LOGGER.info("Figura: "+resultSet.getInt(1)+" - "+
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
