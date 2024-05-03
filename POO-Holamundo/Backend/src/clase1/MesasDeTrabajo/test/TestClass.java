package clase1.MesasDeTrabajo.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestClass {
    @Test
    public void testearQueSeanIguales()
    {
        int numero1=1;
        int numero2=2;

        assertEquals(numero1,numero2);
        assertNotEquals(numero1,2);
    }
}
