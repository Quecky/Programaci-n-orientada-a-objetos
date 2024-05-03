package ExamenProfe;

public class ExamenFinal extends Examen{
    private int notaOral;
    private String temaOral;

    public ExamenFinal(Alumno alumno, String titulo, String enunciado,Double nota,int notaOral, String temaOral)
    {
        super(alumno,titulo,enunciado,nota);
        this.notaOral=notaOral;
        this.temaOral=temaOral;

    }

    public Boolean esMayorQue(ExamenFinal otroExamenFinal)
    {
        double promedioExamen1=(double)(nota+notaOral)/2;
        double promedioExamen2=(double)(otroExamenFinal.nota+otroExamenFinal.notaOral/2);
        return promedioExamen1>promedioExamen2;
    }

}
