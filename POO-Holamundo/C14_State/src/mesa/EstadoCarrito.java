package mesa;

public interface EstadoCarrito {
    public void agregarProducto(Producto producto);
    public void cancelarCarrito();
    public void volverPuntoAnterior();
    public void pasarSiguienteEstado();
}
