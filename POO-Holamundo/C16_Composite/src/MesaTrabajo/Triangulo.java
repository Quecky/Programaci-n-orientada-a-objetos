package MesaTrabajo;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    @Override
    public double calcularArea() {
        return base*altura/2;
    }
}
