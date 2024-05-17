package clase3.ejercicioclase2.service;

import clase3.ejercicioclase2.model.Tarjeta;

public class ApiTarjeta {
    public int descuento(Tarjeta tarjeta)
    {
        int descuento=0;
        if(tarjeta.getBanco().equals("Star Bank"))
        {
            descuento=20;
        }
        return descuento;
    }
}
