package preExamenDario.instituto.ofertasAcademicas;

public class Curso extends OfertaAcademica {
    private int cargaHorariaMensual;
    private double valorHora;

    public Curso(String nombre, String descripcion, int cargaHorariaMensual, double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return this.valorHora * this.cargaHorariaMensual;
    }

    @Override
    public int compareTo(OfertaAcademica o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre=" + super.getNombre() +
                ", precio=" + this.calcularPrecio() +
                '}';
    }
}
