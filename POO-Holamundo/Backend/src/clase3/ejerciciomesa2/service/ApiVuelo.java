package clase3.ejerciciomesa2.service;

import clase3.ejerciciomesa2.model.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiVuelo {
    List<Vuelo> vuelos;

    public ApiVuelo(List<Vuelo> vuelos) {
        this.vuelos = new ArrayList<>();
        cargarVuelos();
    }

    public boolean buscarVuelo(LocalDate fechaIngreso, LocalDate fechaRegreso, String origen, String destino)
    {
        boolean respuesta=false;
        Vuelo vueloBuscar=new Vuelo(origen,destino,fechaIngreso,fechaRegreso);
        for(Vuelo vuelo:vuelos)
        {
            if(vuelo.equals(vueloBuscar))
            {
                respuesta=true;
            }

        }
        return false;
    }

    public void cargarVuelos()
    {
        vuelos.add(new Vuelo("Los Angeles","Mexico",LocalDate.of(2024,06,15),LocalDate.of(2024,06,20)));
        vuelos.add(new Vuelo("Los Angeles","Mexixo",LocalDate.of(2024,06,15),LocalDate.of(2024,06,18)));
    }
}
