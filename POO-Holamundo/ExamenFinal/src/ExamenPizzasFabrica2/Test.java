package ExamenPizzasFabrica2;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria("Pizza Loca");
        PizzaSimple peperoni= new PizzaSimple("Peperoni","Peperoni y queso",100,false);
        PizzaSimple anana= new PizzaSimple("Ananá","Pizza con jamon y piña",950,false);
        PizzaSimple margarita= new PizzaSimple("Margarita especial","Pizza tradicional italiana",850,true);
        pizzeria.agregarPizzaAlMenu("Muzzarela","Pizza de queso italiano",700,false);
        pizzeria.agregarPizzaAlMenu("Combinada loca","Mitad margarita y mitad ananá",margarita,anana);
        pizzeria.agregarPizzaAlMenu("Combinada cuerda","Mitad peperoni y mitad ananá",peperoni,anana);

        pizzeria.mostrarMenu();

    }

}
