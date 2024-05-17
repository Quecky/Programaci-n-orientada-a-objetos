package primerParcial.impl;

import clase6.ejercicioIntegrador.db.H2Connection;
import clase6.ejercicioIntegrador.impl.DomicilioDaoH2;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;

public class ClaseDaoH2 {
    private static Logger LOGGER = Logger.getLogger(DomicilioDaoH2.class);
    private static String SQL_INSERT = "INSERT INTO DOMICILIOS VALUES(DEFAULT,?,?,?,?)";

    public void funcionBD() throws SQLException {
        Connection connection = null;
        try{
            connection = H2Connection.getConnection();
            connection.setAutoCommit(false);

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
                    LOGGER.info(ex.getMessage());
                    ex.printStackTrace();
                }
            }
            LOGGER.info(e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            connection.close();
        }

    }
}
