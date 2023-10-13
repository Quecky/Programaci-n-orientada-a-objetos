package presencial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");
        //en la actualidad no usamos scanner, porque lo usamos para el front
        //ya que no usamos la terminal, se enseña para poder ver errores de un archivo
        Scanner scanner= new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println(nombre+" ingrese su edad");
        int edad=scanner.nextInt();
        scanner.close();
    }
}
