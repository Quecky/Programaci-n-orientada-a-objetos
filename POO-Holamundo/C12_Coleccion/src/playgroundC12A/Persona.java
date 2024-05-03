package playgroundC12A;
import EjercicioProfe.Jugador;

import java.util.*;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private List<Cuenta> cuentas;

    public Persona(String nombre, String apellido, int edad,List<Cuenta> cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentas=cuentas;
    }

    public String getNombreCompleto()
    {
        return nombre+" "+apellido;
    }

    public void agregarCuenta(Cuenta cuenta)
    {
        cuentas.add(cuenta);
    }

    public boolean esMayorEdad()
    {
        if(edad>60)
        {
            return true;
        }
        return false;
    }

    public double getSaldoTotal()
    {
        double sumaCuentas=0;

        for (Cuenta cu:cuentas) {

            sumaCuentas=cu.getSaldo()+sumaCuentas;
        }
        return sumaCuentas;
    }
    public void mostrarCuentas()
    {
        //aqui se deberia devolver una lista ordenada usando compareTo, ordenando de forma manual
        cuentas.stream().sorted().forEach(cuenta -> System.out.println(cuenta.getNroCuenta()+" :"+cuenta.getSaldo()));


    }

}
