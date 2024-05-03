public class FabricaDeIphones {
    /*atributo que almacena la única instancia que será creada*/
    private static FabricaDeIphones instancia;

    /*constructor privado, para que no se pueda instanciar desde fuera*/
    private FabricaDeIphones()
    {
    }

    /*SINGLETON*/
    /*getInstance() retorna la unica instancia que puede ser creada */
    public static FabricaDeIphones getInstance()
    {
        if(instancia == null)
            instancia = new FabricaDeIphones();

        return instancia;
    }

    /*método construir, recibe un string
    que determina el objeto concreto a instanciar */
    public static Iphone construir(String tipo)
    {

        /*indetificar el parámetro recibido con un switch*/
        switch (tipo){
            case "IphoneX":
                return new Iphone11();
            case "Iphone11":
                    return new IphoneX();
            default:
                System.out.println("Ups, no encontramos este objeto para construir");
                return null;

        }
    }
}
