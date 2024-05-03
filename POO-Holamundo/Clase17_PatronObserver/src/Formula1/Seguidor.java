package Formula1;

public class Seguidor implements Observador{//es el observador
    private String nombre;
    private String apellido;
    private int contadorNotificaciones;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibirNotificaciones(String mensaje) {
        System.out.println(this.nombre+" fue notificado con: "+mensaje);
        contadorNotificaciones++;
        System.out.println("Cantidad Notificaciones "+contadorNotificaciones);
    }

    public int getContadorNotificaciones()
    {
        return contadorNotificaciones;
    }
}
