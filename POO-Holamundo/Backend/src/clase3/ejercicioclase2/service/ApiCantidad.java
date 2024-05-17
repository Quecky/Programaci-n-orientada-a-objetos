package clase3.ejercicioclase2.service;

public class ApiCantidad {
    public int descuento(int cantidad)
    {
        int descuento=0;
        if(cantidad>10)
        {
            descuento=10;
        }
        return descuento;
    }
}
