package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    private String nombre;
    private String apellido;
    private String historiaClinica;
    protected LocalDate fechaInternacion;
    protected LocalDate fechaAlta;


    public Paciente(String nombre, String apellido, String historiaClinica, LocalDate fechaInternacion) throws PacienteException {
        LocalDate hoy= LocalDate.now();
        this.nombre=nombre;
        this.apellido=apellido;
        //Excepcion si la fecha de internación fuera
        //posterior al día de hoy
        if(fechaInternacion.isAfter(hoy))
            throw new PacienteException("El paciente no puede internarse un dia despues de su fecha de internacion");
        this.fechaInternacion = fechaInternacion;
    }

    //cuando la fecha de alta es anterior al día de la internación.
    public void darAlta(LocalDate fechaAlta) throws PacienteException {
        if(fechaAlta.isBefore(fechaInternacion)){
            throw new PacienteException("NO puedes dar de alta antes de la fecha de su internacion");
        }

    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public LocalDate getFechaInternacion() {
        return fechaInternacion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }





}
