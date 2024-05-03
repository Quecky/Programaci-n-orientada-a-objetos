package MesaTrabajo;
import java.util.ArrayList;
import java.util.List;
public class Tren extends FiguraGeometrica{
    private List<FiguraGeometrica> figuras = new ArrayList<>();

    public void agregarFigura(FiguraGeometrica figura)
    {
        figuras.add(figura);
    }

    @Override
    public double calcularArea()
    {
        double areaTotal=0;
        for(FiguraGeometrica figura:figuras)
        {
            areaTotal=figura.calcularArea()+areaTotal;
        }
        return areaTotal;
    }
}
