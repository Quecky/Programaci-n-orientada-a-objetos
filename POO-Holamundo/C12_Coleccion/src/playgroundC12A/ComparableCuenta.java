package playgroundC12A;

import EjercicioProfe.Jugador;

public interface ComparableCuenta extends Comparable<Cuenta>{
    int compareTo(Cuenta otraCuenta);
}
