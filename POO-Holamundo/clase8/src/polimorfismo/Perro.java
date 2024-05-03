package polimorfismo;

public class Perro extends Animal{
    @Override
    void hacerSonido()
    {
        System.out.println("GUAU GUAU");
    }
    void jugar()
    {
        System.out.println("El perro esta jugando con un hueso");
    }
}
