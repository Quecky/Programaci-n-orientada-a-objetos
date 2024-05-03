package EjercicioProfe;
import java.util.List;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private List <Jugador> listaJugadores;

    public Equipo(String nombre)
    {
        this.nombre=nombre;
    }

    public Equipo(String nombre,List<Jugador>listaJugadores)
    {
        this.nombre=nombre;
        this.listaJugadores=listaJugadores;

    }
    public void agregarJugador(Jugador jugador)
    {
        listaJugadores.add(jugador);
    }
    public void mostrarJugadoresTitulares()
    {
    //    List <Jugador> listaJugadoresTitulares=new ArrayList<>();
       System.out.println("Lista de jugadores titulares segun el orden: ");
       // for(Jugador jugador:listaJugadores)
    //    {
      //      if(jugador.getTitular())
       //     {
          //      listaJugadoresTitulares.add(jugador);
         //   }
   //     }
        listaJugadores.stream().filter(Jugador::getTitular).sorted().forEach(jugador -> System.out.println(jugador.getNombre()+" -"+jugador.getNumeroDeCamiseta()));
    }
    public int getCantidadDeJugadoresLesionados()
    {
        //stream convierte una lista en un flujo de datos, secuenta de elementos
        return (int)listaJugadores.stream().filter(Jugador::getLesionado).count();
    }
}
