package clase2.dh.backend.service;

import clase2.dh.backend.model.Mail;

public class ManejadorGerencia extends ManejadorMail{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getTema().equalsIgnoreCase("gerencia")||mail.getDestino().equalsIgnoreCase("gerencia@colmena.com"))
        {
            return "El mail sera manejado por gerencia";
        }
        return getSiguiente().comprobarMail(mail);
    }
}
