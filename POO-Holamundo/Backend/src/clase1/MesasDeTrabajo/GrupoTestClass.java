package clase1.MesasDeTrabajo;

import clase1.MesasDeTrabajo.Grupo;
import org.junit.jupiter.api.Test;

//alt enter sobre lo que estamos importando para que instale la libreria
class GrupoTestClass {
    @Test
    void testSoloNombresMayoresASLetras()
    {
        //dado
        Persona persona1=new Persona("Juan", 19);
        Persona persona2=new Persona("Pedro", 20);
        Persona persona3=new Persona("Pedro", 21);
        Persona persona4=new Persona("Lola", 22);
        Persona persona5=new Persona("Antonio", 23);

        Grupo grupo =new Grupo();
        //cuando
        grupo.agregarPersonas(persona1);
        grupo.agregarPersonas(persona2);
        grupo.agregarPersonas(persona3);
        grupo.agregarPersonas(persona4);
        grupo.agregarPersonas(persona5);

        //entonces

        int valorEsperado=3;
        int valorObtenido=grupo.integrantes.size();


    }


}