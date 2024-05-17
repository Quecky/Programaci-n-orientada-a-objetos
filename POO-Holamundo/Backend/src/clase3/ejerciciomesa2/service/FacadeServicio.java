package clase3.ejerciciomesa2.service;

import java.time.LocalDate;

public class FacadeServicio implements IFacadeServicio{
    ApiHotel apiHotel;
    ApiVuelo apiVuelo;


    @Override
    public boolean buscarServicio(String origen, String destino, LocalDate fechaInicio, LocalDate fechaFin) {
        return false;
    }
}
