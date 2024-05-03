package PresencialCopiado;

public class CLiente {
    public static void main(String[] args) {
        Producto hamburguesa= new Hamburguesa("simple",5.99);
        Producto papasFritas= new Acompañamiento("rustica",2.49);


        System.out.println("Precio del producto 1: "+hamburguesa.getPrecio());
        System.out.println("Precio del Producto 2: "+papasFritas.getPrecio());

        Combo comboDH= new Combo("Combo Digital House");
        comboDH.agregarProducto(hamburguesa);
        comboDH.agregarProducto(papasFritas);


        CarritoCompras carrito= new CarritoCompras();
        carrito.agregarProductoAlCarrito(hamburguesa);
        carrito.agregarProductoAlCarrito(papasFritas);
        carrito.agregarProductoAlCarrito(comboDH);

        double totalCompra= carrito.calcularPrecioTotalCarrito();
        System.out.println("Total a abonar : $"+totalCompra);
        System.out.println("Carrito: ");
        carrito.listaDeProductos();
        System.out.println("***********************************");
        System.out.println("Precio del combo seleccionado: $"+comboDH.getPrecio());

    }
}
