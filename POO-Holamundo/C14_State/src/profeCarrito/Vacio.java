package EjercicioMesaStateC15;

public class Vacio implements EstadoCarrito{

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("Producto agregado: "+producto.getDescripcion());
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("carrito cancelado");

    }

    @Override
    public void volverAlPuntoAnterior() {
        //no hace nada este punto
    }

    @Override
    public void siguienteEstado() {
        System.out.println("el carrito pasa a estar CARGANDO ");
    }
}
