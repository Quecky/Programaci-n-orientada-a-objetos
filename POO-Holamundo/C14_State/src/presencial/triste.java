package presencial;

public class triste implements EstadoTamagochi{
    @Override
    public void recibirBebida()
    {
        System.out.println("hace 3 beep y titila");
    }

    @Override
    public void recibirComida()
    {
        System.out.println("hace 3 beep y vomita");
    }

    @Override
    public void recibirMimos()
    {
        System.out.println("Se pone hambriento");
    }
}
