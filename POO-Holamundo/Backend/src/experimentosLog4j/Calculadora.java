package experimentosLog4j;

import org.apache.log4j.Logger;

public class Calculadora {
    private static final Logger logger = Logger.getLogger(Calculadora.class);
    private int  valor1;
    private int valor2;

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int sumar()
    {
        return valor1+valor2;
    }
    public int restar()
    {
        return valor1-valor2;
    }

    public int multiplicar()
    {
        return valor1*valor2;
    }

    public double dividir()
    {
        logger.info("empezamos a dividir "+valor1+" y "+valor2);
        double resultado=0.0;
        try
        {
            resultado=valor1/valor2;
        }
        catch(Exception e)
        {
            System.out.println("error al dividir");
        }
        return resultado;
    }
}
