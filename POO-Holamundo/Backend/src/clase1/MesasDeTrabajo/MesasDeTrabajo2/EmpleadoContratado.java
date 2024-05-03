package clase1.MesasDeTrabajo.MesasDeTrabajo2;

public class EmpleadoContratado extends Empleado{
    private int CantHoras;
    private double tarifaPorHora;

    public EmpleadoContratado(String nombre, String apellido, String nroCuenta, int cantHoras, double tarifaPorHora) {
        super(nombre, apellido, nroCuenta);
        CantHoras = cantHoras;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getCantHoras() {
        return CantHoras;
    }

    public void setCantHoras(int cantHoras) {
        CantHoras = cantHoras;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}
