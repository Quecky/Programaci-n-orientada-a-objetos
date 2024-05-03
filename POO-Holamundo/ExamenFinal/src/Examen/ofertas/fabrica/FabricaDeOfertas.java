package Examen.ofertas.fabrica;

import Examen.ofertas.OfertaDeProductos;
import Examen.ofertas.Paquete;
import Examen.ofertas.Producto;

import java.util.List;

public class FabricaDeOfertas {
    public static String CODIGO_PRODUCTO = "producto";
    public static String CODIGO_PAQUETE = "paquete";

    public static OfertaDeProductos crear(String tipo, String nombre, String descripcion, double precio, List<Producto> productos) throws ErrorEnCreacionDeOferta {
        if (tipo.equals(CODIGO_PRODUCTO)) {
            return new Producto(nombre, descripcion, precio, 0.1);
        } else if (tipo.equals(CODIGO_PAQUETE )) {
            return new Paquete(nombre, descripcion, precio, 0.1, productos);
        }
        throw new ErrorEnCreacionDeOferta();
    }



}
