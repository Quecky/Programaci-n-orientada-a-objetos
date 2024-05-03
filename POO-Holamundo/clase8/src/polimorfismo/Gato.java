package polimorfismo;

public class Gato extends Animal{
   @Override
   void hacerSonido()
    {
        System.out.println("miau miau");
    }
    void jugar()
    {
        System.out.println("El gato esta jugando con un ovillo de hilo");
    }
}
