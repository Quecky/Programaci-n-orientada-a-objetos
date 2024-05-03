package Formula2;
import java.util.*;
public class Main {
    Usuario dalia = new Usuario("Dalia");
    Seguidor seguidor1= new Seguidor("Emmanuel");

    dalia.addObserver(seguidor1);
    dalia.subirFoto();

}
