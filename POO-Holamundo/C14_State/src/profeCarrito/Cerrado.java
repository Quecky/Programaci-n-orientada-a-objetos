package EjercicioMesaStateC15;

public class Cerrado implements EstadoCarrito{

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("no se puede agregar mas producto");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("no se puede");
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("no se puede");
    }

    @Override
    public void siguienteEstado() {
        System.out.println("no se puede");


    }
}
