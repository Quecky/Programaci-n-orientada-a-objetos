package Formula2;
import java.util.*;

public class Seguidor implements Observer {//es el observador
    private String nombre;
    private String apellido;
    private int contadorNotificaciones;

    @Override
    public void update(Observable o, Object arg) {
        String mensaje=(String)arg;
        System.out.println(this.nombre+" fue notificado con "+mensaje);
        contadorNotificaciones++;

    }



    public Seguidor(String nombre) {
        this.nombre = nombre;
    }



    public int getContadorNotificaciones()
    {
        return contadorNotificaciones;
    }
}
