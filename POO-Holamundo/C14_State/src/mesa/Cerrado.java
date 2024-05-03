package mesa;

public class Cerrado implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("Ya no se aceptan mas productos");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No es posible, ya se completo la compra");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("No se puede");
    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("Ya no es posible pasar al siguente estado");

    }
}
