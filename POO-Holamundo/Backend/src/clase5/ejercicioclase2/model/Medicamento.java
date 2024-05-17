package clase5.ejercicioclase2.model;

public class Medicamento {
    private Integer id;
    private Integer codigo;
    private String nombre;
    private String labortatorio;
    private int cantidad;
    private double precio;

    public Medicamento(Integer codigo, String nombre, String labortatorio, int cantidad, double precio) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.labortatorio = labortatorio;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Medicamento(Integer id, Integer codigo, String nombre, String labortatorio, int cantidad, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.labortatorio = labortatorio;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLabortatorio() {
        return labortatorio;
    }

    public void setLabortatorio(String labortatorio) {
        this.labortatorio = labortatorio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", labortatorio='" + labortatorio + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
