package Examen.ofertas;

import java.util.List;

public class Paquete extends OfertaDeProductos{
    private List<Producto> productos;
    private double precio;
    private double descuento;


    @Override
    public double calcularPrecio() {
        return calcularPrecioDelPaquete()+ calcularPrecioTotalDeProductos();
    }


    @Override
    public int compareTo(OfertaDeProductos o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }


    public Paquete(String nombre, String descripcion,double precio, double descuento, List<Producto> productos) {
        super(nombre, descripcion);
        this.precio=precio;
        this.descuento=descuento;
        this.productos=productos;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }


    @Override
    public String toString() {
        return "Paquete de productos: {" +
                this.mostrarProductos() +
                "}";
    }

    private String mostrarProductos() {
        String productosAmostrar = "";
        for (Producto producto: this.productos) {
            productosAmostrar += producto;
        }
        return productosAmostrar;
    }

    private double calcularPrecioDelPaquete() {
        return precio+precio*descuento;
    }

    private double calcularPrecioTotalDeProductos() {
        double precioProductos = 0;
        for (Producto producto: this.productos) {
            precioProductos += producto.calcularPrecio();
        }
        return precioProductos;
    }


}
