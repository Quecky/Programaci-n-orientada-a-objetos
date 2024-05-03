package PresencialCopiado;

import java.util.ArrayList;
import java.util.List;

//compuesto
public class Combo extends Producto {

    private List<Producto> productos= new ArrayList<>();

    public Combo(String nombre) {
        super(nombre, 0.0);
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public Double getPrecio() {
       //es sobreescribirlo
        double precioTotal=0;
        for (Producto producto : productos) {
            precioTotal+= producto.getPrecio();
                    }
        //aplicar un descuento del 10%
        return precioTotal*0.9;
    }
}
