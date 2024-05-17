package clase3.ejercicioclase2.service;

import clase3.ejercicioclase2.model.Producto;
import clase3.ejercicioclase2.model.Tarjeta;

public interface IFacadeDescuento {
    int calculoDescuento(Tarjeta tarjeta, Producto producto, int cantidad);
}
