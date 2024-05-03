package SimulacroFinal;
import java.util.*;
public class ProgramaIntensivo extends OfertaAcademica{
    private List<Curso> listaCursos=new ArrayList<>();
    private double porcentajeBonificacion;

    public ProgramaIntensivo(String nombre, String descripcion, List<Curso> listaCursos, double porcentajeBonificacion) {
        super(nombre, descripcion);

        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
