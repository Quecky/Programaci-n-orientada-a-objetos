package mesaFactory;

public class ProductoFactory {

    public static Producto crearProducto(String tipo){
        if (tipo.equalsIgnoreCase("CAJA10X10")) { //Este equals ignora las mayusculas y minusculas
            return new Caja(10,10,10);
        } else if (tipo.equalsIgnoreCase("PELOTAFUTBOL")) {
            return new Pelota(11);
        } else if (tipo.equalsIgnoreCase("PELOTATENIS")) {
            return new Pelota(0.32);
        }
        else {
            throw new IllegalArgumentException("Tipo de producto no valido.");
        }
    };
}
