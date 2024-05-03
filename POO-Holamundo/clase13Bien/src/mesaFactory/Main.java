package mesaFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {

            Almacen almacen1 = new Almacen(); // Almacen donde se alojan los productos mediante lista.
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa producto1: ");
            String tipoProducto = scanner.nextLine();
            Producto producto1 = ProductoFactory.crearProducto(tipoProducto); //Fabrica para crear productos
            System.out.println("Ingresa producto2: ");
            tipoProducto = scanner.nextLine();
            Producto producto2 = ProductoFactory.crearProducto(tipoProducto);
            scanner.close();

            System.out.println("El espacio del producto1 es: " + producto1.CalcularEspacio());
            System.out.println("El espacio del producto2 es: " + producto2.CalcularEspacio());
            almacen1.agregarProducto(producto1);
            almacen1.agregarProducto(producto2);
            System.out.println("El Espacio necesario para todos los productos es: "+almacen1.calcularEspacionNecesario());


        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
