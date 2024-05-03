package veterinaria;

public class Cliente {

    //static sirve a la clase al modelo, pero para las constantes en realidad es static final
    private String nombre;
    private String apellido;
    private String nombreDeLaMascota;

    public Cliente(String nombre, String apellido, String nombreDeLaMascota)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.nombreDeLaMascota=nombreDeLaMascota;

    }
}
