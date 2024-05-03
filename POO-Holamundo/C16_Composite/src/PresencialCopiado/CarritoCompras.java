package PresencialCopiado;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos= new ArrayList<>();


    public void agregarProductoAlCarrito(Producto producto){
        productos.add(producto);
    }
public void listaDeProductos(){
    System.out.println("Los productos integrados en el carrito son: ");
    for (Producto producto : productos) {
        System.out.println("********************************");
        System.out.println(producto.getNombre());
            }
}
    public double calcularPrecioTotalCarrito(){
        double total=0;
        for (Producto producto : productos) {
            total+= producto.getPrecio();

        }
        return total;
    }

}
