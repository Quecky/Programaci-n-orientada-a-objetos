package ExamenPizzas;
import java.util.*;
import java.util.TreeSet;
public class PizzaCombinada extends Pizza{

    private TreeSet<PizzaSimple> pizzasIncluidas;
    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzasIncluidas=new TreeSet<PizzaSimple>();
    }

    @Override
    public int compareTo(Pizza o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }

    public void agregarPizzaSimple(PizzaSimple pizza)
    {
        pizzasIncluidas.add(pizza);
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
