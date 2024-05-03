package clase1.MesasDeTrabajo.MesasDeTrabajo2.test;

import clase1.MesasDeTrabajo.MesasDeTrabajo2.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    @DisplayName("Deberia emitir un decumento en papel cuando es un empleado efectivo")
    void testEmpleadoEfectivo()
    {
        Empleado empleado1 = new EmpleadoEfectivo("Martin","Martini","4545",400,40,50);
        Liquidador liquidador = new LiquidadorEfectivo();

        String respuestaObtenida=liquidador.LiquidarSueldos(empleado1);
        String respuestaEsperada="La liquidación generada es un documento impreso Saldo a liquidar: 420.0";
        assertEquals(respuestaObtenida,respuestaEsperada);
    }

    @Test
    @DisplayName("Deberia emitir un decumento en papel cuando es un empleado contratado")
    void testEmpleadoContratado()
    {
        Empleado empleado1 = new EmpleadoContratado("Martin","Martini","4545",120,7);
        Liquidador liquidador = new LiquidadorContratado();

        String respuestaObtenida=liquidador.LiquidarSueldos(empleado1);
        String respuestaEsperada="La liquidación generada es un documento impreso Saldo a liquidar: 840.0";
        assertEquals(respuestaObtenida,respuestaEsperada);
    }
}