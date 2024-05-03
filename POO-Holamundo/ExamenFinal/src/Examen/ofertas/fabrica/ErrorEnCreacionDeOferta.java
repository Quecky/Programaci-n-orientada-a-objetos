package Examen.ofertas.fabrica;

public class ErrorEnCreacionDeOferta extends Exception {
    public ErrorEnCreacionDeOferta() {
        super("No se pudo crear el producto solicitado.");
    }

}
