public class Paciente {
    private Consulta consulta;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private Boolean primeraVez;

    public Paciente(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Boolean primeraVez)
    {
        this.consulta=consulta;
        this.fechaNacimiento=fechaNacimiento;
        this.nombre=nombre;
        this.apellido=apellido;
        this.primeraVez=primeraVez;

    }


    public String getNombre()
    {
        return nombre;
    }
    public Boolean getPrimeraVez()
    {
        return primeraVez;
    }
}
