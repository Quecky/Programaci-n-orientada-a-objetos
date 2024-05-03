package playgroundC12A;
import java.lang.*;
public class Cuenta implements ComparableCuenta{
    private int nroCuenta;
    private double saldo;

    public Cuenta(int nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Cuenta cuenta) {
        //devuelve 0 si son iguales, si es mayor un numero mayor a 0, si es menor un numero menor a 0
        return Integer.compare(nroCuenta,cuenta.nroCuenta);
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
