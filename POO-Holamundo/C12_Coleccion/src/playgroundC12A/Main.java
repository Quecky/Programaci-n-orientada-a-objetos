package playgroundC12A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona dalia=new Persona("Dalia","Barranco",25,new ArrayList<>());
        dalia.agregarCuenta(new Cuenta(321,3000));
        Cuenta cuentaDalia1=new Cuenta(123,1000);
        Cuenta cuentaDaliaMP=new Cuenta(133,43);


        dalia.agregarCuenta(cuentaDalia1);
        dalia.agregarCuenta(cuentaDaliaMP);
        cuentaDalia1.compareTo(cuentaDaliaMP);


        System.out.println("Saldo total de "+dalia.getNombreCompleto()+": "+dalia.getSaldoTotal());
        dalia.mostrarCuentas();



    }

}

