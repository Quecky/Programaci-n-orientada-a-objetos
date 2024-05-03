package presencial;

public class Tamagochi {
    private EstadoTamagochi estado;

    public Tamagochi()
    {
        estado=new Hambriento();
    }

    public void recibirComida()
    {
        estado.recibirComida();
        if(estado instanceof Hambriento)
        {
            estado=new feliz();

        } else if (estado instanceof  triste) {
            estado=new triste();
        }
    }

    public void recibirBebida()
    {
        estado.recibirBebida();
        if(estado instanceof  feliz)
        {
            estado=new Hambriento();
        } else if (estado instanceof triste) {
            ((triste) estado).recibirBebida();

        }else if(estado instanceof Hambriento)
        {

        }
    }

    public void recibirMimos()
    {
        estado.recibirMimos();
        if(estado instanceof triste)
        {
            estado=new feliz();
        }
    }
}
