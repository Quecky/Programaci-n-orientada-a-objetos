package mesa;

public class Pagando implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("Ya no se aceptan mas productos");

    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Cancelado desde estado Pagando");

    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("No se puede volver al punto anterior");

    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("El carrito esta cerrado, no se pueden cargar mas productos");

    }
}
