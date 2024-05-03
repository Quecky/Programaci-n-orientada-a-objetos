package mesaFactory;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    // creacion de lista Productos.
    List<Producto> listaProductos=new ArrayList<>();
    //Metodo calcular espacio necesario
    double calcularEspacionNecesario(){
        double espacioFinal=0;
        for (Producto producto:listaProductos) {
            espacioFinal+=producto.CalcularEspacio();
        }
        return espacioFinal;
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }



}
