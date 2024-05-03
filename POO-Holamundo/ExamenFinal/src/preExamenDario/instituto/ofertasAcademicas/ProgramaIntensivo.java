package preExamenDario.instituto.ofertasAcademicas;

import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {
    private List<Curso> cursos;
    private int cargaHorariaMensual;
    private double valorHora;

    public ProgramaIntensivo(String nombre, String descripcion, int cargaHorariaMensual, double valorHora, List<Curso> cursos) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.valorHora = valorHora;
        this.cursos = cursos;
    }

    @Override
    public double calcularPrecio() {
        return calcularPrecioTotalDeCursos() + calcularPrecioDelPrograma();
    }

    @Override
    public int compareTo(OfertaAcademica o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }

    @Override
    public String toString() {
        return "ProgramaIntensivo{" +
                this.mostrarCursos() +
                "}";
    }

    private String mostrarCursos() {
        String cursos = "";
        for (Curso curso: this.cursos) {
            cursos += curso;
        }
        return cursos;
    }

    private double calcularPrecioDelPrograma() {
        return this.valorHora * this.cargaHorariaMensual;
    }

    private double calcularPrecioTotalDeCursos() {
        double precioCursos = 0;
        for (Curso curso: this.cursos) {
            precioCursos += curso.calcularPrecio();
        }
        return precioCursos;
    }
}
