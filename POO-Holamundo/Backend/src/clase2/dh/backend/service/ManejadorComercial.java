package clase2.dh.backend.service;

import clase2.dh.backend.model.Mail;

public class ManejadorComercial extends ManejadorMail{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getTema().equalsIgnoreCase("comercial")||mail.getDestino().equalsIgnoreCase("comercial@colmena.com"))
        {
            return "El mail sera manejado por Comercial";
        }
        return getSiguiente().comprobarMail(mail);

    }
}
