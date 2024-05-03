package ExamenProfe;

public class Examen {
    protected Double nota;
    public Examen(Alumno alumno,String titulo, String enunciado,Double nota)
    {
        this.nota=nota;

    }

    public Boolean estaAprobado()
    {
        return nota>=4;

    }
}
