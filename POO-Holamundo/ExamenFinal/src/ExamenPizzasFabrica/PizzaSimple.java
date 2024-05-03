package ExamenPizzasFabrica;

public class PizzaSimple extends Pizza {
    private double precioBase;
    private boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion,double precioBase,boolean esEspecia) {
        super(nombre, descripcion);
        this.precioBase=precioBase;
        this.esEspecial=esEspecia;
    }

    @Override
    public int compareTo(Pizza o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }

    @Override
    public double calcularPrecio() {
        if(!esEspecial)
        {
            return precioBase;
        }
        return precioBase*1.7;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }


}
