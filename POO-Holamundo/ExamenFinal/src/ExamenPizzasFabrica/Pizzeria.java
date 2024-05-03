package ExamenPizzasFabrica;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> menuPizzas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        menuPizzas = new ArrayList<>();
    }
    public void agregarPizzaAlMenu(String tipo, String nombre, String descripcion, double precio, boolean especial, TreeSet<PizzaSimple> pizzasIncluidas)
    {
        try {
            Pizza nuevaPizza = FabricaDePizzas.crear(tipo, nombre, descripcion, precio,especial,pizzasIncluidas);
            menuPizzas.add(nuevaPizza);
       } catch(ErrorEnCreacionDePizza e) {
            System.out.println(e.getMessage());
        }
    }

    public void agregarPizzaAlMenu(Pizza pizza)
    {
       menuPizzas.add(pizza);

    }



    public void mostrarMenu()
    {
        System.out.println("----Menu "+this.nombre+"----");
        for(Pizza pizza : menuPizzas)
        {

            System.out.println("-"+pizza.getNombre()+" $"+pizza.calcularPrecio());
        }

    }
}
