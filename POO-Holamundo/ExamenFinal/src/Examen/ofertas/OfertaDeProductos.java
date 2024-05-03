package Examen.ofertas;

public abstract class OfertaDeProductos implements Comparable<OfertaDeProductos>{
    private String nombre;
    private String descripcion;



    public OfertaDeProductos(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
