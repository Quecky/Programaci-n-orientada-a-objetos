package mesa;
import java.util.List;
public class Carrito {


    private List<Producto> productosAgregados;
    private EstadoCarrito estado;

    public Carrito()
    {
        this.estado= new Vacio();
    }

    public void setEstadoCarrito(EstadoCarrito estado)
    {
        this.estado=estado;
    }
    public void agregarProducto(Producto producto)
    {
        this.estado=new Cargando();
        this.productosAgregados.add(producto);
    }


    public void cancelarCarrito() {
        this.estado=new Vacio();
        this.productosAgregados.clear();

    }


    public void volverPuntoAnterior() {
        if(this.estado instanceof Cerrado)
        {
            this.estado=new Pagando();

        }else if(this.estado instanceof Pagando)
        {

        }

    }


    public void pasarSiguienteEstado() {

    }

}
