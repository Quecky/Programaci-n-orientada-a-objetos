package EjercicioMesaStateC15;



public interface EstadoCarrito {
    void agregarProducto(Producto producto);
    void cancelarCarrito();
    void volverAlPuntoAnterior();
    void siguienteEstado();
}
