package SimulacroFinal;
import java.util.*;

public class FullStack extends Cursos{
    private List<Cursos> listaCursos=new ArrayList<>();
    private double porcentajeBonificacion;
    public FullStack(String nombre, String descripcion, int cargaHoraria, int mesesDuracion, int hora,double porcentajeBonificacion) {
        super(nombre, descripcion, cargaHoraria, mesesDuracion, hora);
        this.porcentajeBonificacion=porcentajeBonificacion;
    }

    public void agregarCurso(Cursos curso)
    {
        listaCursos.add(curso);
    }

    @Override
    public double calcularPrecio(int cargaHoraria, int mesesDuracion, int hora) {
        double totalPrecio=0;
       for(Cursos curso:listaCursos){
           totalPrecio=curso.calcularPrecio(cargaHoraria,mesesDuracion,hora)+totalPrecio;
       }
        totalPrecio=totalPrecio-totalPrecio*porcentajeBonificacion;

        return totalPrecio;
    }
}
