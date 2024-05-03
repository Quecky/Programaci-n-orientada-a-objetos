package MesaTrabajo;

public class Circulo extends FiguraGeometrica{
    private double radio;
    private static final double pi = 3.1416;

    public Circulo(double radio)
    {
        this.radio=radio;
    }
    @Override
    public double calcularArea()
    {
        return pi*radio*radio;
    }
}
