package EjercicioMesaStateC15;

public class Pagando implements EstadoCarrito{

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("en este punto no se agregar mas productos");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("compra cancelada");
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("no se puede volver al punto anterior");

    }

    @Override
    public void siguienteEstado() {
        System.out.println("el carrito esta cerrado, no se pueden cargar mas productos");

    }
}
