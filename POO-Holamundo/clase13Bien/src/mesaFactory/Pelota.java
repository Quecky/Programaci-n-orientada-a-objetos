package mesaFactory;

public class Pelota extends Producto{

    private double radio;

    public Pelota(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularEspacio() {
        return Math.PI*Math.pow(radio,2);
    }
}
