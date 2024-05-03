package mesa;

public class Vacio implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("Producto agregado"+producto.getDescripcion());

    }

    @Override
    public void cancelarCarrito() {

    }

    @Override
    public void volverPuntoAnterior() {
//no hace nada este punto
    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("El carrito pasa a estar cargando");

    }
}
