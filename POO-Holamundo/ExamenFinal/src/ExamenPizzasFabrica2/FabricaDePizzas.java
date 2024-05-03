package ExamenPizzasFabrica2;


import java.util.TreeSet;

public class FabricaDePizzas {

    public static Pizza crear(String nombre, String descripcion,PizzaSimple pizza1, PizzaSimple pizza2)
    {
        PizzaCombinada nuevaPizzaCombinada=new PizzaCombinada(nombre, descripcion);
        nuevaPizzaCombinada.agregarPizzaSimple(pizza1);
        nuevaPizzaCombinada.agregarPizzaSimple(pizza2);

              return nuevaPizzaCombinada;
    }

    public static Pizza crear(String nombre, String descripcion, double precio, boolean especial)
    {

                return new PizzaSimple(nombre, descripcion, precio,especial);

    }
}
