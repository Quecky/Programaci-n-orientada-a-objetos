package preExamenDario.instituto.ofertasAcademicas.fabrica;

public class ErrorEnCreacionDeOfertaAcademica extends Exception {
    public ErrorEnCreacionDeOfertaAcademica() {
        super("No se pudo crear el curso solicitado.");
    }
}
