package ExamenPizzas;

public class Test {
    public static void main(String[] args) {
     //   PizzaSimple peperoni= new PizzaSimple("Peperoni","Peperoni y queso",100,false);
      //  PizzaSimple unapizza= new PizzaSimple("Hawaiana","Jamon y piña",185.5,false);
      //  PizzaSimple otrapizza= new PizzaSimple("Hawaiana cherry","Jamon, piña y cereza",150,false);
        PizzaSimple muzzarela= new PizzaSimple("Muzzarela","Pizza de queso italiano",700,false);
        PizzaSimple margarita= new PizzaSimple("Margarita especial","Pizza tradicional italiana",850,true);
        PizzaSimple anana= new PizzaSimple("Ananá","Pizza con jamon y piña",950,false);
        PizzaCombinada pizzacom = new PizzaCombinada("Combinada loca","Mitad margarita y mitad ananá");
        pizzacom.agregarPizzaSimple(margarita);
        pizzacom.agregarPizzaSimple(anana);
        Pizzeria pizzeria = new Pizzeria("Pizza Loca");
        pizzeria.agregarPizzaAlMenu(pizzacom);
        pizzeria.agregarPizzaAlMenu(muzzarela);
        pizzeria.agregarPizzaAlMenu(margarita);
        pizzeria.agregarPizzaAlMenu(anana);
        pizzeria.mostrarMenu();
        pizzacom.mostrarPizzasIncluidas();
    }

}
