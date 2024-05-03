package SimulacroFinal;

public class BackEnd extends Cursos{
    public BackEnd(String nombre, String descripcion, int cargaHoraria, int mesesDuracion, int hora) {
        super(nombre, descripcion, cargaHoraria, mesesDuracion, hora);
    }

    @Override
    public double calcularPrecio(int cargaHoraria, int mesesDuracion, int hora) {
        return cargaHoraria*mesesDuracion*hora;
    }
}
