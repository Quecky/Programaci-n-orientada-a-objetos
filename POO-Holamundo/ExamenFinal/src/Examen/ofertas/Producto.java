package Examen.ofertas;

public class Producto extends OfertaDeProductos {

    private double precio;
    private double impuesto;

    public Producto(String nombre, String descripcion, double precio, double impuesto) {
       super(nombre,descripcion);
        this.precio = precio;
        this.impuesto = impuesto;
    }

    @Override
    public int compareTo(OfertaDeProductos o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }

    public Producto(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public double calcularPrecio() {
        return precio+precio*impuesto;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
}
