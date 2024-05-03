package clase2.mesatrabajo2.service;

import clase2.mesatrabajo2.model.Usuario;

public class Descargar implements ServicioDescarga{
    @Override
    public String descargar(Usuario usuario) {
        return "Ya se esta descargando la canción";
    }
}
