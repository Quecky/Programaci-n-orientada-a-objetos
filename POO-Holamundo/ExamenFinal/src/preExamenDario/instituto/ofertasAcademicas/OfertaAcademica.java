package preExamenDario.instituto.ofertasAcademicas;

public abstract class OfertaAcademica implements Comparable<OfertaAcademica> {
    private String nombre;
    private String descripcion;

    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
