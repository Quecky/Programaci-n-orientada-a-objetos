package MesaTrabajo;

public class Rectangulo extends FiguraGeometrica {
    private double alto;
    private double largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return alto*largo;
    }
}
