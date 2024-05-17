package clase3.ejerciciomesa2.model;

import java.time.LocalDate;
import java.util.Objects;

public class Hotel {

    private String ciudad;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;

    public Hotel(String ciudad, LocalDate fechaSalida, LocalDate fechaLlegada) {
        this.ciudad = ciudad;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(ciudad, hotel.ciudad) && Objects.equals(fechaSalida, hotel.fechaSalida) && Objects.equals(fechaLlegada, hotel.fechaLlegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, fechaSalida, fechaLlegada);
    }
}
