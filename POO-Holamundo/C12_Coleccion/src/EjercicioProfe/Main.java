package EjercicioProfe;

public class Main {
    public static void main(String[] args) {
        Equipo equipoA = new Equipo("Deportivo");
        equipoA.agregarJugador(new Jugador(3,"Dali",false,true));
        Jugador jugador1=new Jugador(1,"Junior",true,false);
        equipoA.agregarJugador(jugador1);
        equipoA.mostrarJugadoresTitulares();
        System.out.println("Jugadore lesionados: "+equipoA.getCantidadDeJugadoresLesionados());
    }
}
