package ExamenProfe;

public class Parcial extends Examen {
    private int numeroIntentos;
    private int numeroUnidad;
    public Parcial(Alumno alumno, String titulo,String enunciado, Double nota,int numeroIntentos, int numeroUnidad)
    {
        super(alumno,titulo,enunciado,nota);
        this.numeroIntentos=numeroIntentos;
        this.numeroUnidad=numeroUnidad;
    }

    public Boolean sePuedeRecuperar()
    {
        if(numeroIntentos<=3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
