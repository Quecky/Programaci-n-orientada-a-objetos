package clase3.ejercicioclase2.service;

import clase3.ejercicioclase2.model.Producto;
import clase3.ejercicioclase2.model.Tarjeta;

public class FacadeDescuento implements IFacadeDescuento{
    ApiCantidad apiCantidad;
    ApiTarjeta apiTarjeta;

    ApiProducto apiProducto;

    public FacadeDescuento()
    {
        apiCantidad=new ApiCantidad();
        apiTarjeta=new ApiTarjeta();
        apiProducto=new ApiProducto();

    }

    @Override
    public int calculoDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        int sumaDescuentos=0;
        sumaDescuentos+=apiCantidad.descuento(cantidad);
        sumaDescuentos+=apiProducto.descuento(producto);
        sumaDescuentos+=apiTarjeta.descuento(tarjeta);
        return sumaDescuentos;
    }
}
