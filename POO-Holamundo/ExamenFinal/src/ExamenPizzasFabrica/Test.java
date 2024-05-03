package ExamenPizzasFabrica;

import java.util.*;
import java.util.Set;
public class Test {
    public static void main(String[] args) {
        PizzaSimple muzzarela= new PizzaSimple("Muzzarela","Pizza de queso italiano",700,false);
        PizzaSimple margarita= new PizzaSimple("Margarita especial","Pizza tradicional italiana",850,true);

        TreeSet<PizzaSimple> lista= new TreeSet<>();

        Pizzeria pizzeria = new Pizzeria("Pizza Loca");
        pizzeria.agregarPizzaAlMenu("PizzaSimple","Ananá","Pizza con jamon y piña",950,false,lista);
        lista.add(muzzarela);
        lista.add(margarita);
        pizzeria.agregarPizzaAlMenu("PizzaCombinada","Combinada loca","Mitad margarita y mitad ananá",1450,false,lista);
        pizzeria.agregarPizzaAlMenu(muzzarela);
        pizzeria.agregarPizzaAlMenu(margarita);
        pizzeria.mostrarMenu();

    }

}
