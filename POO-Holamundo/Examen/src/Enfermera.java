public class Enfermera {
    public Boolean hacerHistorialClinico(Paciente paciente)
    {
        return paciente.getPrimeraVez();
    }

    public void compararAsociados(PacienteObraSocial paciente1, PacienteObraSocial paciente2)
    {
        if(paciente1.getNumeroAsociado()>paciente2.getNumeroAsociado())
        {
            System.out.println("El paciente "+paciente1.getNombre()+" tiene un mayor numero de Asociado que el paciente "+paciente2.getNombre());
        }
        else
        {
            System.out.println("El paciente "+paciente2.getNombre()+" tiene un mayor numero de Asociado que el paciente "+paciente1.getNombre());
        }

    }
}
