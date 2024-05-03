package ExamenPizzas;

import java.util.*;

public class Pizzeria {
    private String nombre;
    private List<Pizza> menuPizzas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        menuPizzas = new ArrayList<>();
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
