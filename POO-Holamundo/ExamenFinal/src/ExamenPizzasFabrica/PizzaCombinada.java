package ExamenPizzasFabrica;

import java.util.TreeSet;
public class PizzaCombinada extends Pizza {

    private TreeSet<PizzaSimple> pizzasIncluidas;
    public PizzaCombinada(String nombre, String descripcion,TreeSet<PizzaSimple> pizzasIncluidas) {
        super(nombre, descripcion);
        this.pizzasIncluidas=pizzasIncluidas;
    }

    @Override
    public int compareTo(Pizza o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }

    public void mostrarPizzasIncluidas()
    {
        System.out.println("Pizzas incluidas en pizza combinada "+this.getNombre());
        for(PizzaSimple pizza:pizzasIncluidas)
        {
            System.out.println("Pizza simple: "+pizza.getNombre()+"- $"+pizza.calcularPrecio());
        }
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public double calcularPrecio() {

        return pizzasIncluidas.last().calcularPrecio();
    }
}
