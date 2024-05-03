package Formula1;
import java.util.*;
public class Usuario { //el usuario es la clase observable
    private String nombre;
    private String apellido;
    private List <Observador> seguidores;

    public Usuario(String nombre) {
        this.nombre = nombre;

        this.seguidores = new ArrayList<>();
    }

    public void subirFoto()
    {
        String mensaje = this.nombre+ " subio una foto";
        notificar(mensaje);
    }

    public void agregarSeguidor(Observador seguidor)
    {
        seguidores.add(seguidor);
    }
    public void eliminarSeguidor(Observador seguidor)
    {
        seguidores.remove(seguidor);
    }

    public void notificar(String mensaje)
    {
        for(Observador seguidor:seguidores)
        {
            seguidor.recibirNotificaciones(mensaje);

        }
    }
}
