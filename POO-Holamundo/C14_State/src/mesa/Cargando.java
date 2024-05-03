package mesa;

import java.util.ArrayList;
import java.util.List;

public class Cargando implements EstadoCarrito{
    private List<Producto> productos=new ArrayList<>();
    @Override
    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
        System.out.println("Producto agregado");
    }

    @Override
    public void cancelarCarrito()
    {
        productos.clear();
        System.out.println("Cancelado desde estado Cargando");
    }

    @Override
    public void volverPuntoAnterior()
    {
        cancelarCarrito();
        System.out.println("Estado Vacio");
    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("Estado Pagando");

    }
}
