package EjercicioMesaStateC15;

import java.util.ArrayList;
import java.util.List;

public class Cargando implements EstadoCarrito{
    private List<Producto> productos= new ArrayList<>();


    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: "+producto.getDescripcion()+" Precio del producto: "+producto.getPrecio());
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("carrito cancelado");
        productos.clear();

    }

    @Override
    public void volverAlPuntoAnterior() {
        cancelarCarrito();
    }

    @Override
    public void siguienteEstado() {
        System.out.println("El carrito pasa al estado PAGANDO");
    }
}
