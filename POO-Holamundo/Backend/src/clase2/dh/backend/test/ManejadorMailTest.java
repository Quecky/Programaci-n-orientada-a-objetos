package clase2.dh.backend.test;

import clase2.dh.backend.model.Mail;
import clase2.dh.backend.service.ProcesarMail;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

//anadir al classpath son las variables de entorno del SO
class ManejadorMailTest {
    @Test
    @DisplayName("Testear que el mail lo maneje Comercial")
    public void test1()
    {
        Mail mail = new Mail("empresa@gmail.com","comercial@colmena.com","comercial");
        ProcesarMail procesarMail = new ProcesarMail();
        String respuesta = procesarMail.cadenaResponsabilidadMail(mail);
        assertEquals("El mail sera manejado por el Area Comercial",respuesta);
    }

    @Test
    @DisplayName("Testear que el mail vaya a Spam")
    public void test2()
    {
        Mail mail = new Mail("empresa@gmail.com","nose@colmena.com","alguna oferta");
        ProcesarMail procesarMail = new ProcesarMail();
        String respuesta = procesarMail.cadenaResponsabilidadMail(mail);
        assertEquals("El mail sera enviado a spam",respuesta);
    }


}