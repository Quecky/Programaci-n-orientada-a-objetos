public class Cliente {
    public static void main(String[] args) {
        try {
        /* sacar comentario para ver error al intentar instanciar
        una clase que tiene su constructor privado*/
       //     FabricaDeIphones fabrica = new FabricaDeIphones();

            /*instanci de cada objeto, y ejecución de método abrir()*/
            Iphone gs1 = FabricaDeIphones.construir("IphoneX");


            Iphone gs2 = FabricaDeIphones.construir("Iphone11");


        /*intento construir objeto que no posee ninguna
        clase concreta*/
            Iphone gs3 = FabricaDeIphones.construir("Iphone6");
 

        }catch (Exception e){
            System.out.println("¡Exception encontrada!: " + e);
        }

    }
}
