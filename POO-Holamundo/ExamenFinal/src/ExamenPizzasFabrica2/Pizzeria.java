package ExamenPizzasFabrica2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Pizzeria {
    private String nombre;
    private HashSet<Pizza> menuPizzas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        menuPizzas = new HashSet<>();
    }
    public void agregarPizzaAlMenu(String nombre, String descripcion, PizzaSimple pizza1, PizzaSimple pizza2)
    {

            agregarPizzaAlMenu(FabricaDePizzas.crear(nombre, descripcion,pizza1,pizza2));
            agregarPizzaAlMenu(pizza1);
            agregarPizzaAlMenu(pizza2);


    }


    public void agregarPizzaAlMenu(String nombre, String descripcion, double precio, boolean especial)
    {

            agregarPizzaAlMenu(FabricaDePizzas.crear(nombre, descripcion, precio,especial));

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

            System.out.println("-"+pizza.getNombre()+" "+pizza.getDescripcion()+" $"+pizza.calcularPrecio());
        }

    }
}
