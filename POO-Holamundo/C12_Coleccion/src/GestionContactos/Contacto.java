package GestionContactos;
import java.util.*;

public class Contacto {
  //  private List<Contacto> listaContactos=new ArrayList<>();
    //private Set <String> nombreUnicos=new HashSet<>();
    //private Map<String,String> nombreANumero=new HashMap<>();

private String nombre;
private int numero;

    public Contacto(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
