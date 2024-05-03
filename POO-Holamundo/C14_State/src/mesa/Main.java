package mesa;

public class Main {
    public static void main(String[] args) {
            Carrito carrito = new Carrito();
            Producto producto1 = new Producto("salchica",10);
            Producto producto2 = new Producto("huevo",20);
            carrito.agregarProducto(producto1);
            carrito.agregarProducto(producto2);
            carrito.pasarSiguienteEstado();
            carrito.agregarProducto(new Producto("pan",15));
            carrito.cancelarCarrito();

            carrito.volverPuntoAnterior();
    }
}
