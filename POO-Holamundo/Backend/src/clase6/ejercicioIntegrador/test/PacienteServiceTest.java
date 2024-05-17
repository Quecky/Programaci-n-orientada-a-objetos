package clase6.ejercicioIntegrador.test;

import clase6.ejercicioIntegrador.impl.PacienteDaiH2;
import clase6.ejercicioIntegrador.model.Domicilio;
import clase6.ejercicioIntegrador.model.Paciente;
import clase6.ejercicioIntegrador.service.PacienteService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PacienteServiceTest {

    private static PacienteService pacienteService=new PacienteService(new PacienteDaiH2());
    private static Logger LOGGER = Logger.getLogger(PacienteServiceTest.class);
    @BeforeAll
    static void crearTablas(){
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/db_clinica_1605;INIT=RUNSCRIPT FROM 'create2.sql'", "sa", "sa");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }

    @Test
    @DisplayName("Testear paciente guardado")
    void testearPacienteGuardado() throws SQLException {
        Paciente paciente = new Paciente("Fulanita","Fefo","43434", LocalDate.of(2024,04,22),
                new Domicilio("Calle falsa",423,"Springfield","Monterrey"));
       // PacienteService pacienteService = new PacienteService(new PacienteDaiH2());
        Paciente pacienteDesdeLaBD = pacienteService.registrarPaciente(paciente);
        assertNotNull(pacienteDesdeLaBD);

    }

    @Test
    @DisplayName("Testear busqueda paciente por ID")
void testsPacientePorID() throws SQLException {
        Integer id = 1;
        Paciente pacienteEncontrado=pacienteService.buscarPorId(id);
        assertEquals(id,pacienteEncontrado.getId());
    }


    @Test
    @DisplayName("Testear busqueda todos los pacientes")
    void testBusquedaTodos() throws SQLException {
        Paciente paciente = new Paciente("Cosme","Manganito","443",LocalDate.of(2024,25,13),
                new Domicilio("pololo",23,"loco","Jamaica"));
    pacienteService.registrarPaciente(paciente);
    List<Paciente> pacientes = pacienteService.buscarTodos();
    assertEquals(1,pacientes.size());

    }

}