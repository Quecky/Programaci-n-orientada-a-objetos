package clase1.MesasDeTrabajo.MesasDeTrabajo2;

public class LiquidadorContratado extends Liquidador{
    @Override
    public double calcularSueldo(Empleado empleado) {
        if(empleado instanceof EmpleadoEfectivo)
        {

        }

       EmpleadoContratado empleadoContratado=((EmpleadoContratado) empleado);
        return empleadoContratado.getTarifaPorHora()*empleadoContratado.getCantHoras();
    }

    @Override
    public String imprimir(Empleado empleado) {
        return "documento digital";
    }
}
