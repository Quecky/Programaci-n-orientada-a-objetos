package ExamenPizzasFabrica;


import java.util.TreeSet;

public class FabricaDePizzas {
    public static final String CODIGO_PIZZASIMPLE = "PizzaSimple";
    public static final String CODIGO_PIZZACOMBINADA = "PizzaCombinada";

    public static Pizza crear(String tipo, String nombre, String descripcion, double precio, boolean especial, TreeSet<PizzaSimple> pizzasIncluidas) throws ErrorEnCreacionDePizza {

      switch(tipo)
      {
          case CODIGO_PIZZASIMPLE:
              return new PizzaSimple(nombre, descripcion, precio,especial);
          case CODIGO_PIZZACOMBINADA:
              return new PizzaCombinada(nombre, descripcion, pizzasIncluidas);
              default:
                  throw new ErrorEnCreacionDePizza();

      }


   }
}
