package Presencial;

import java.util.List;


public class CarritoCompras {
    private List<Producto> productos;
    public CarritoCompras(List<Producto> productos)
    {

    }

    public void agregarProductoAlCarrito(Producto producto)
    {
        productos.add(producto);
    }
}
