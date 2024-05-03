public class Consulta {
    private String fechaConsulta;
    private String especialidad;

    private Integer hora;
    private Integer minuto;

    public Consulta(String fechaConsulta, String especialidad, Integer hora, Integer minuto)
    {
        this.fechaConsulta=fechaConsulta;
        this.especialidad=especialidad;
        this.hora=hora;
        this.minuto=minuto;

    }
}
