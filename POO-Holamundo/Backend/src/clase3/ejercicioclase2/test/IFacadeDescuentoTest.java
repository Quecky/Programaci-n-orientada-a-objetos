package clase3.ejercicioclase2.test;

import clase3.ejercicioclase2.model.Producto;
import clase3.ejercicioclase2.model.Tarjeta;
import clase3.ejercicioclase2.service.FacadeDescuento;
import clase3.ejercicioclase2.service.IFacadeDescuento;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IFacadeDescuentoTest {
    @Test
    @DisplayName("Testear que sumamos todos los descuentos")
    void testTodosDescuentos()
    {
        Tarjeta tarjeta=new Tarjeta("4424","Star Bank");
        Producto producto = new Producto("Latas de duraznos","latas");
        int cantidad=10;
        IFacadeDescuento facadeDescuento = new FacadeDescuento();
        int descuentoObtenido=facadeDescuento.calculoDescuento(tarjeta,producto,cantidad);
        assertEquals(descuentoObtenido,30);
    }
}