package presencial;
import java.util.Date;

public class ImpresoraEpson extends Impresora{
    public ImpresoraEpson(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponible, Double porcentajeTinta)
    {
        super(modelo,tipoConexion,fechaFabricacion,hojasDisponible,porcentajeTinta);

    }
    @Override
    public String imprimir()
    {
        if(tienePapel() && !necesitaTinta())
        {
            return "Imprimiendo desde impresora Epson";
        }
        else{
            return "No se puede imprimir";
        }
    }

    @Override
    public Boolean necesitaTinta()
    {
        return true;
    }

    @Override
    public Boolean tienePapel()
    {
        return true;
    }
}

