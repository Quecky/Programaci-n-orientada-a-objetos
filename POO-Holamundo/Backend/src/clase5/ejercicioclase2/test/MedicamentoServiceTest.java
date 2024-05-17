package clase5.ejercicioclase2.test;

import clase5.ejercicioclase2.dao.impl.MedicamentoIDaoH2;
import clase5.ejercicioclase2.model.Medicamento;
import clase5.ejercicioclase2.service.MedicamentoService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MedicamentoServiceTest {
//aqui creamos la base de datos para testear
    @BeforeAll
    static void crearTabla()
    {
        Connection connection=null;
        try
        {
            Class.forName("org.h2.Driver");
            //cambia nombre base de datos para no tener errores
            connection= DriverManager.getConnection("jdbc:h2:~/clase10_c4;INIT=RUNSCRIPT FROM 'create.sql'","SA","SA");
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

    public static Logger LOGGER= Logger.getLogger(MedicamentoServiceTest.class);

    @Test
    @DisplayName("Testear que un medicamento persiste en la base de datos")
    void testearMedicamentoEnBaseDeDatos()
    {
        Medicamento medicamento = new Medicamento(1234,"apirina","BAGD",38,10);
        MedicamentoService medicamentoService =  new MedicamentoService(new MedicamentoIDaoH2());
        Medicamento medicamentoRegistrado = medicamentoService.registrar(medicamento);

        assertNotNull(medicamentoRegistrado);

    }

    @Test
    @DisplayName("Testear que retorna un medicamento pasandole un nombre")
    void testearMedicamentoPorNombre()
    {

        MedicamentoService medicamentoService =  new MedicamentoService(new MedicamentoIDaoH2());
       String nombre ="IBUPROFENO";
        Medicamento medicamentoEncontrado = medicamentoService.buscarPorNombre(nombre);

        assertEquals(nombre,medicamentoEncontrado.getNombre());

    }

    @Test
    @DisplayName("Testear que no retorna un medicamento pasandole un nombre que no existe")
    void testearMedicamentoPorNombreNoExistente()
    {
        Medicamento medicamento = new Medicamento(1234,"apirina","BAGD",38,10);

        MedicamentoService medicamentoService =  new MedicamentoService(new MedicamentoIDaoH2());
        String nombre ="IBUPROFENO";
        Medicamento medicamentoEncontrado = medicamentoService.buscarPorNombre(nombre);

        assertEquals(nombre,medicamentoEncontrado.getNombre());

    }
}