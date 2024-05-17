package clase3.ejercicioclase1.test;

import clase3.ejercicioclase1.model.Computadora;
import clase3.ejercicioclase1.service.ComputadoraFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadoraFactoryTest {
    @Test
    @DisplayName("Testear que solo se crea una instancia de windows")
    public void testUnaInstancia()
    {
        Computadora computadora1= ComputadoraFactory.obtenerComputadora("Windows");
        Computadora computadora2= ComputadoraFactory.obtenerComputadora("Windows");
        assertEquals(1,Computadora.getContador());
    }

}