package presencial;
import java.util.Date;
// es como una clase modelo
public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private Integer hojasDisponible;
    protected Double porcentajeTinta;
    public Impresora(String modelo,String tipoConexion,Date fechaFabricacion,Integer hojasDisponible,Double porcentajeTinta)
    {
        this.modelo=modelo;
        this.tipoConexion=tipoConexion;
        this.fechaFabricacion=fechaFabricacion;
        this.hojasDisponible=hojasDisponible;
        this.porcentajeTinta=porcentajeTinta;
    }
    //sino podemos abstract tenemos que poner que va
    //hacer el metodo
    public abstract Boolean tienePapel();
    public abstract  Boolean necesitaTinta();
    public abstract String imprimir();

}
