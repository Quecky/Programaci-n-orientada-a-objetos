package Examen.supermercado;

import Examen.ofertas.OfertaDeProductos;
import Examen.ofertas.Producto;
import Examen.ofertas.fabrica.FabricaDeOfertas;
import Examen.ofertas.fabrica.ErrorEnCreacionDeOferta;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private List<OfertaDeProductos> ofertas;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();
    }

    public void agregarOferta(String tipo, String nombre, String descripcion,double precio,List<Producto> productos)
    {
        try {
            OfertaDeProductos nuevaOferta = FabricaDeOfertas.crear(tipo, nombre, descripcion, precio,productos);
            this.ofertas.add(nuevaOferta);
        } catch(ErrorEnCreacionDeOferta e) {
            System.out.println(e.getMessage());
        }

    }



    public void informe() {
        System.out.println("----Reporte----");

        this.ofertas.stream()
               .sorted()
                .forEach(oferta -> System.out.println(oferta.getClass()+"{nombre="+oferta.getNombre()+", precio="+oferta.calcularPrecio()+"}"));
       // this.ofertas.stream().filter(OfertaDeProductos::calcularPrecio).sorted().forEach(oferta -> System.out.println(oferta.getNombre()+" -"+oferta.calcularPrecio()));
        System.out.println("----" + this.nombre + "----");
    }


}
