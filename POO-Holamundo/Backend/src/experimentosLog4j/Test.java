package experimentosLog4j;
import org.apache.log4j.Logger;

public class Test {
    private static final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Calculadora calculadora= new Calculadora(1,3);
        int suma = calculadora.sumar();
        double division=calculadora.dividir();
        System.out.println(suma);
        System.out.println(division);
    }
}
