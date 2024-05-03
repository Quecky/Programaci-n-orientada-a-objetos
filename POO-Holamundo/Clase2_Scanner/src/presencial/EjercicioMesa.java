package presencial;

import java.util.Scanner;

public class
EjercicioMesa {
    public static void main(String[] args) {
        Ejercicio1();
    }
    public static void Ejercicio1()
    {
        System.out.println("Ingresa un número ");
        Scanner scanner= new Scanner(System.in);
        int numero=scanner.nextInt();
        if(verificarPrimo(numero))
        {
            System.out.println("El numero es primo");
        }
        else
            System.out.println("El numerous NO es primo");

    }
    public static boolean verificarPrimo(int numero)
    {
        boolean resultado=true;
        if(numero<=0)
        {
            resultado= false;
        }
        else
        {
            if(numero==1||numero==2)
            {
                resultado= true;
            }
            else
            {
             for(int i=3; i<numero;i++)
             {

             }
            }

        }
        return resultado;

    }
    public static boolean esDivisible(int n,int divisor)
    {
        return n%divisor==0;
    }
}
