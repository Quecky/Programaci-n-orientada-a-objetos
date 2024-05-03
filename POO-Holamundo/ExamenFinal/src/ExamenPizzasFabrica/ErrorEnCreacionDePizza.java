package ExamenPizzasFabrica;

public class ErrorEnCreacionDePizza extends Exception {
    public ErrorEnCreacionDePizza() {
        super("No se pudo crear la pizza solicitada.");
    }

}
