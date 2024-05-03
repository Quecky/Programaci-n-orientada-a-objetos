package clase2.dh.backend.service;

import clase2.dh.backend.model.Mail;

public class ManejadorSpam extends ManejadorMail{
    @Override
    public String comprobarMail(Mail mail) {
        return "El mail sera enviado a Spam";
    }
}
