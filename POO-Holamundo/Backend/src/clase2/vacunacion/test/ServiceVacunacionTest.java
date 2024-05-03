package clase2.vacunacion.test;

import clase2.vacunacion.service.ProxyVacunacion;
import clase2.vacunacion.service.ServiceVacunacion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import clase2.vacunacion.model.Persona;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ServiceVacunacionTest {
    @Test
    @DisplayName("La persona se puede vacunar")
    void test1()
    {
        Persona persona = new Persona("Hazel","Vilchis","44423", LocalDate.of(2024,04,15),"antigripal");
        ServiceVacunacion servicevacunacion = new ProxyVacunacion();
        String respuesta=servicevacunacion.vacunar(persona);

        assertEquals("La persona: Hazel Vilchis se vacunó con antigripal",respuesta);

    }
}