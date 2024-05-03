package clase2.dh.backend.service;

import clase2.dh.backend.model.Mail;

public abstract class ManejadorMail {
    private ManejadorMail siguiente;

    public ManejadorMail getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ManejadorMail siguiente) {
        this.siguiente = siguiente;
    }

    public abstract String comprobarMail(Mail mail);

}
