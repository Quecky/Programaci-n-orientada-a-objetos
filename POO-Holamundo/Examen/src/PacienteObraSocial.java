public class PacienteObraSocial extends Paciente{
    private String nombreObraSocial;
    private Integer numeroAsociado;
    public PacienteObraSocial(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Boolean primeraVez,String nombreObraSocial,Integer numeroAsociado)
    {
        super( consulta,  fechaNacimiento,  nombre,  apellido,  primeraVez);
        this.nombreObraSocial=nombreObraSocial;
        this.numeroAsociado=numeroAsociado;

    }
    public Integer getNumeroAsociado()
    {
        return numeroAsociado;
    }



}
