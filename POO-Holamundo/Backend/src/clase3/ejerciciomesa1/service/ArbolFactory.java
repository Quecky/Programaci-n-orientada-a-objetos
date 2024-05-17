package clase3.ejerciciomesa1.service;

import clase3.ejerciciomesa1.model.Arbol;
import clase3.ejerciciomesa1.model.EtipoArbol;

import java.util.HashMap;

public class ArbolFactory {
    private static HashMap<EtipoArbol, Arbol> arboles = new HashMap<EtipoArbol, Arbol>();
}
