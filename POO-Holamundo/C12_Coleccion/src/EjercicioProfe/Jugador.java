package EjercicioProfe;

public class Jugador implements ComparableJugador {
    private int numeroDeCamiseta;
    private String nombre;
    private Boolean lesionado;

    private Boolean titular;

    public Jugador(int numeroDeCamiseta,String nombre, Boolean lesionado, Boolean titular)
    {
        this.numeroDeCamiseta=numeroDeCamiseta;
        this.nombre=nombre;
        this.lesionado=lesionado;
        this.titular=titular;

    }

    public int getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLesionado(Boolean lesionado) {
        this.lesionado = lesionado;
    }

    public void setTitular(Boolean titular) {
        this.titular = titular;
    }

    public Boolean getLesionado()
    {
        return lesionado;
    }

    public Boolean getTitular()
    {
        return titular;
    }

    @Override
    public int compareTo(Jugador otroJugador)
    {
        return Integer.compare(numeroDeCamiseta,otroJugador.numeroDeCamiseta);
    }

}
