package experimentosBDH2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testDB {
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:"+"./Database/sy","root","myPassword");
        Statement stat = connection.createStatement();

        String createTable = "DROP TABLE IF EXISTS TEST; CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255))";
        stat.execute(createTable);

        String insertarFila = "INSERT INTO TEST VALUES(1,´Hola´)";
        String insertarFila2 = "INSERT INTO TEST VALUES(2,´Chau´)";

        stat.execute(insertarFila);
        stat.execute(insertarFila2);

        String sql = "SELECT * FROM TEST";
        ResultSet rd = stat.executeQuery(sql);

        while(rd.next())
        {
            System.out.println(rd.getInt(1)+rd.getString(2));
        }
    }

}
