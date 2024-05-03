package Formula2;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Usuario { //el usuario es la clase observable
    private String nombre;
    private String apellido;
    private List <Observer> seguidores;

    public Usuario(String nombre) {
        this.nombre = nombre;

        this.seguidores = new ArrayList<>();
    }

    public void subirFoto()
    {
        String mensaje = this.nombre+ " subio una foto";
        notificar(mensaje);
        setChanged();
        notifyObservers();
    }


    public void addObserver(Observer seguidor)
    {
        seguidores.add(seguidor);
    }
    public void eliminarSeguidor(Observer seguidor)
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
