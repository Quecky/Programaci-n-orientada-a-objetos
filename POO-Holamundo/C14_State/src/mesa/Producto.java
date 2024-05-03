package mesa;

import java.util.*;//or

import java.util.ArrayList;
import java.util.List;


public class Producto {
    private String Descripcion;
    private Integer Precio;
    private List<Producto> productosAgregados;
    public Producto(String Descripcion, Integer precio)
    {
        this.Descripcion=Descripcion;
        this.Precio = precio;

    }

    public String getDescripcion() {
        return Descripcion;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public List<Producto> getProductosAgregados() {
        return productosAgregados;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }

    public void setProductosAgregados(List<Producto> productosAgregados) {
        this.productosAgregados = productosAgregados;
    }
}
