package clase1.MesasDeTrabajo.MesasDeTrabajo2;

public abstract class Liquidador {
    public String LiquidarSueldos(Empleado empleado)
    {
        String respuesta=null;
        //paso 1:calcular sueldo
        double sueldo=calcularSueldo(empleado);
        if(sueldo>0)
        {
            //paso 2: imprimir
            String imprimir=imprimir(empleado);
            // paso 3: depositar
            depositar(empleado);
            respuesta="La liquidacion generada es un "+imprimir+" Saldo a liquidar: "+sueldo;

        }

        return respuesta;
    }

    public abstract double calcularSueldo(Empleado empleado);
    public abstract  String imprimir(Empleado empleado);
    public void depositar(Empleado empleado){
        System.out.println("estoy depositando en la caja de ahorros "+empleado.getNroCuenta());
    }
}
