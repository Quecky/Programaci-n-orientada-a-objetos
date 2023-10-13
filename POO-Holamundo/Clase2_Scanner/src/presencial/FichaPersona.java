package presencial;

import java.util.Scanner;

public class FichaPersona {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese su fecha de nacimiento, primero día, luego mes, y luego año ");
        int dia=scanner.nextInt();
        int mes=scanner.nextInt();
        int anio=scanner.nextInt();
        String iniciales=obtenerIniciales(nombre, apellido);
        String fechaNacimiento=obtenerFechaNacimiento(dia,mes,anio);

        String ficha="Nombre completo: "+nombre+" "+apellido+"\n";
        System.out.println(ficha+"Iniciales: "+iniciales);
        System.out.println("Fecha nacimiento "+fechaNacimiento);
    }
    //static es una funcionalidad para la clase
    public static String obtenerIniciales(String nombre, String apellido)
    {
        char inicialNombre=nombre.charAt(0);
        char inicialApellido=apellido.charAt(0);
        return inicialNombre+" "+inicialApellido;
    }
    public static String obtenerFechaNacimiento(int dia, int mes,int anio)
    {
        String diaStr=String.format("%02d",dia);
        String mesStr=String.format("%02d",mes);
        return diaStr+"/"+mesStr+"/"+anio;
    }
}


