package EjercicioMesaStateC15;

public class Main {
    public static void main(String[] args) {
        CarritoDeCompras carrito= new CarritoDeCompras();

        //agrego productos
        Producto producto1= new Producto("Salchicha",10.0);
        Producto producto2= new Producto("Coca cola",20.0);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        carrito.siguienteEstado();

        //ahora intente agregar un prod
        carrito.agregarProducto(new Producto("Pan",15.0));

        carrito.cancelarCarrito();

        carrito.volverAlPuntoAnterior();
    }
}
