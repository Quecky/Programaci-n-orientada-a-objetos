package polimorfismo;

public class Cliente {
    public static void main(String[] args)
    {
        Animal animal;
        animal=new Perro();
        animal.hacerSonido();

        animal = new Gato();
        animal.hacerSonido();

        //EL casteo es una forma de convertir
        //un tipo de dato a otro tipo de dato
        //implicitamente es cuando asigno al padre
        //las responsabilidades del hijo
        Perro perro=new Perro();
        Animal animal1=perro;
        // al reves no es posible, que perro sea animal

        //casteo explicito, pero puede generar algun error
        Animal otroAnimal=new Gato();
        Gato gato = (Gato)otroAnimal;

        Animal miAnimal=new Gato();
        if(miAnimal instanceof Perro){
            Perro miPerro=(Perro)miAnimal;
            miPerro.hacerSonido();
            miPerro.jugar();
        }
        else{
            System.out.println("El animal no se puede comportar como perro porque se ha instaciado un gato");
        }
        System.out.println("..........");
        Animal otroAnimal2 = new Gato();
        if(otroAnimal2 instanceof Gato) //esta pregunta se hace para hacer el casteo
        {
            Gato miGato=(Gato)otroAnimal2;
            miGato.hacerSonido();
            miGato.jugar();
        }

        double numeroDouble=10.5;
        int numeroEntero=(int)numeroDouble;
        System.out.println(numeroEntero);
        System.out.println("**********");
        double numeroDouble2=7.8;
        String numeroString=Double.toString(numeroDouble2);
        System.out.println(numeroString);
    }
}
