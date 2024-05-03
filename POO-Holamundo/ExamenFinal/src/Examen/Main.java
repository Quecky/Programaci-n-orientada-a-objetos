package Examen;

import Examen.ofertas.Producto;
import Examen.ofertas.fabrica.FabricaDeOfertas;
import Examen.supermercado.Supermercado;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("Market House");
        Producto harina = new Producto("Harina", "Harina leudante", 30, 0.1);
        Producto agua = new Producto("Agua", "Agua sin gas", 15, 0.1);
        supermercado.agregarOferta("paquete", "Masa de Pizza", "Ingredientes de pizza", 50, List.of(agua, harina));
        supermercado.agregarOferta("producto", "Agua", "Agua con gas", 20, List.of());
        supermercado.agregarOferta("producto", "Harina", "Harina común", 15, List.of());
        supermercado.agregarOferta("producto", "Chocolate", "Chocolate con maní", 20, List.of());
        supermercado.informe();
    }
}
