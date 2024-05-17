package clase3.ejercicioclase2.service;

import clase3.ejercicioclase2.model.Producto;

public class ApiProducto {

    public int descuento(Producto producto)
    {
        int descuento=0;
        if(producto.getTipo().equals("latas"))
        {
            descuento=10;
        }
        return descuento;
    }
}
