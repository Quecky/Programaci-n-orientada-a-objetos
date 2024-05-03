package ExamenPizzas;

public abstract class Pizza implements Comparable<Pizza>{
    private String nombre;
    private String descripcion;



    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }



    public String getDescripcion() {
        return descripcion;
    }


}
