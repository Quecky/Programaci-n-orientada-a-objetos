public class PacienteParticular extends Paciente{
    private Integer precioConsulta;
    private Integer dni;
    public PacienteParticular(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Boolean primeraVez, Integer precioConsulta, Integer dni)
    {
        super(consulta, fechaNacimiento, nombre,apellido, primeraVez);
        this.precioConsulta=precioConsulta;
        this.dni=dni;
    }
}
