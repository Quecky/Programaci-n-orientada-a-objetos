package com.company;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) throws PacienteException {
	    Paciente paciente=new Paciente("Juan","Perez","12345", LocalDate.of(2023,11,22));
        System.out.println(paciente.getFechaInternacion());
        LocalDate fechaAlta = LocalDate.of(2023, 11, 21);
        paciente.darAlta(fechaAlta );
    }
}
