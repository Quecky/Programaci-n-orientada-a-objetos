import javax.swing.*;

public class Hospital {
    public static void main(String[] args) {
        Enfermera enfermeraLila = new Enfermera();
        Consulta consultaP1 = new Consulta("13/11/23","Pediatria",7,0);
        Paciente paciente1 = new Paciente(consultaP1,"17/04/1998","Dalia","Barranco",true);
        if(enfermeraLila.hacerHistorialClinico(paciente1))
        {
            System.out.println("Enfermera Lila: Es la primera vez del paciente "+paciente1.getNombre());
        }
        else{
            System.out.println("Enfermera Lila: El paciente "+paciente1.getNombre()+" ya tiene historial clinica");
        }
        Consulta consultaPOS1 = new Consulta("13/11/23","Ginecologia",7,12);
        Consulta consultaPOS2 = new Consulta("13/11/23","Dentista",7,15);

        PacienteObraSocial pacienteOS1= new PacienteObraSocial(consultaPOS1,"11/11/1991","Rhys","Marquez",false,"Ayudemonos",123);
        PacienteObraSocial pacienteOS2= new PacienteObraSocial(consultaPOS2,"11/07/1994","Tobi","Jalisco",true,"AyudemonosSOS",122);
        if(enfermeraLila.hacerHistorialClinico(pacienteOS1))
        {
            System.out.println("Enfermera Lila: Es la primera vez del paciente "+pacienteOS1.getNombre());
        }
        else{
            System.out.println("Enfermera Lila: El paciente "+pacienteOS1.getNombre()+" ya tiene historial clinica");
        }
        if(enfermeraLila.hacerHistorialClinico(pacienteOS2))
        {
            System.out.println("Enfermera Lila: Es la primera vez del paciente "+pacienteOS2.getNombre());
        }
        else{
            System.out.println("Enfermera Lila: El paciente "+pacienteOS2.getNombre()+" ya tiene historial clinica");
        }
        enfermeraLila.compararAsociados(pacienteOS1,pacienteOS2);

    }
}
