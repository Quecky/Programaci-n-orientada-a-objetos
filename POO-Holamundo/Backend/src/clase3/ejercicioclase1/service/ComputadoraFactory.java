package clase3.ejercicioclase1.service;

import clase3.ejercicioclase1.model.Computadora;

import java.util.HashMap;

public class ComputadoraFactory {
    private static HashMap <String, Computadora> poolComputadoras= new HashMap<>();



    public static Computadora obtenerComputadora(String tipo)
    {
        Computadora computadora=poolComputadoras.get(tipo);
        if(computadora==null)
        {
            switch (tipo)
            {
                case"Windows":
                {
                    computadora = new Computadora(tipo,2,128);
                    break;
                }
                case"Mac16":
                {
                    computadora = new Computadora(tipo,16,500);
                    break;
                }
                default:
                    System.out.println("No existe ese tipo de computadora");

            }
            poolComputadoras.put(tipo,computadora);

        }
        else {
            System.out.println("Computadora encontrada");
        }

        return computadora;
    }

}
