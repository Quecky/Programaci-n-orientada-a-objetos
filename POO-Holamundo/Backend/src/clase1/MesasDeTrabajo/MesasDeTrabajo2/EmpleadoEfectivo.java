package clase1.MesasDeTrabajo.MesasDeTrabajo2;

public class EmpleadoEfectivo extends Empleado{
    private double sueldoBasico;
    private double descuentos;
    private double premios;

    public EmpleadoEfectivo(String nombre, String apellido, String nroCuenta, double sueldoBasico, double descuentos, double premios) {
        super(nombre, apellido, nroCuenta);
        this.sueldoBasico = sueldoBasico;
        this.descuentos = descuentos;
        this.premios = premios;
    }
}
