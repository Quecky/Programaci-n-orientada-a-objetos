package clase3.ejerciciomesa2.service;

import clase3.ejerciciomesa2.model.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiHotel {
    List<Hotel> hoteles;

    public ApiHotel(List<Hotel> hoteles) {
        this.hoteles = new ArrayList<>();
        cargarHoteles();
    }

    public boolean buscarHotel(LocalDate fechaIngreso, LocalDate fechaRegreso, String ciudad)
    {
        boolean respuesta=false;
        Hotel hotelBuscar=new Hotel(ciudad,fechaIngreso,fechaRegreso);
        for(Hotel hotel:hoteles)
        {
            if(hotel.equals(hotelBuscar))
            {
                respuesta=true;
            }

        }
        return false;
    }

    public void cargarHoteles()
    {
        hoteles.add(new Hotel("Mexico",LocalDate.of(2024,06,15),LocalDate.of(2024,06,20)));
        hoteles.add(new Hotel("Mexico",LocalDate.of(2024,06,15),LocalDate.of(2024,06,18)));
    }
}
