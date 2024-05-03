package clase2.dh.backend.service;

import clase2.dh.backend.model.Mail;

public class ManejadorTecnico extends ManejadorMail{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getTema().equalsIgnoreCase("tecnico")||mail.getDestino().equalsIgnoreCase("tecnico@colmena.com"))
        {
            return "El mail sera manejado por Tecnico";
        }
        return getSiguiente().comprobarMail(mail);

    }
}
