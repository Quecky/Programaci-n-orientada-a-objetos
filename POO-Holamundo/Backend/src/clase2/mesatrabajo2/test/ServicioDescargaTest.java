package clase2.mesatrabajo2.test;

import clase2.mesatrabajo2.model.Usuario;
import clase2.mesatrabajo2.model.tipoDeUsuario;
import clase2.mesatrabajo2.service.ProxyServicioDescarga;
import clase2.mesatrabajo2.service.ServicioDescarga;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioDescargaTest {
    @Test
    @DisplayName("Descarga la cancion")

    void test1()
    {
        Usuario usuario1 = new Usuario("12", tipoDeUsuario.Premium);
        ServicioDescarga spotify = new ProxyServicioDescarga();

        String respuesta=spotify.descargar(usuario1);

        assertEquals("Ya se esta descargando la canción",respuesta);

    }

    @Test
    @DisplayName("NO Descarga la cancion")

    void test2()
    {
        Usuario usuario1 = new Usuario("12", tipoDeUsuario.Free);
        ServicioDescarga spotify = new ProxyServicioDescarga();

        String respuesta=spotify.descargar(usuario1);

        assertEquals("Solo es posible descargar a los usuarios premium",respuesta);

    }

}