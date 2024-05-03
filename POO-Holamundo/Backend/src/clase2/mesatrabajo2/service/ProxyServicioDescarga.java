package clase2.mesatrabajo2.service;

import clase2.mesatrabajo2.model.Usuario;
import clase2.mesatrabajo2.model.tipoDeUsuario;

public class ProxyServicioDescarga implements ServicioDescarga{
    Descargar descargador;

    public ProxyServicioDescarga()
    {
        descargador = new Descargar();
    }
    @Override
    public String descargar(Usuario usuario) {
        if(usuario.getTipoUsuario().equals(tipoDeUsuario.Premium))
        {
            return descargador.descargar(usuario);
        }
        return "Solo es posible descargar a los usuarios premium";
    }
}
