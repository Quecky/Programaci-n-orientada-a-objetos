package EjercicioMesaStateC15;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private EstadoCarrito estadoCarrito;
    private List<Producto> productos= new ArrayList<>();

    public  CarritoDeCompras(){
        estadoCarrito= new Vacio();
    }

    public void setEstadoCarrito(EstadoCarrito estadoCarrito) {
        this.estadoCarrito = estadoCarrito;
    }

    public void agregarProducto(Producto producto){
        estadoCarrito.agregarProducto(producto);
        productos.add(producto);
    }
    public void cancelarCarrito(){
        estadoCarrito.cancelarCarrito();
        productos.clear();
    }
    public void volverAlPuntoAnterior(){
        estadoCarrito.volverAlPuntoAnterior();
    }
    public void siguienteEstado(){
        estadoCarrito.siguienteEstado();
    }
}
