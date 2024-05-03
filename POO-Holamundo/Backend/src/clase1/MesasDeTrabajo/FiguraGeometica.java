package clase1.MesasDeTrabajo;

public class FiguraGeometica {
    private String tipo;
    private double lado;

    public FiguraGeometica(String tipo, int lado) {
        this.tipo = tipo;
        this.lado = lado;
    }

    public String CalcularArea()
    {
        double area=0;

        if(tipo=="Cuadrado")
            area= lado*lado;
        else if(tipo=="Circulo")
            area= lado*lado*3.1416;

        return "El area del "+this.tipo+" es "+area;


    }

}
