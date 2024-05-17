package clase6.ejercicioIntegrador.impl;

import clase5.ejercicioclase2.dao.IDao;
import clase6.ejercicioIntegrador.model.Paciente;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PacienteEnMemoria implements IDao<Paciente> {
   private Logger LOGGER = Logger.getLogger(PacienteEnMemoria.class);
   List<Paciente> pacientes = new ArrayList<>();
    @Override
    public Paciente registrar(Paciente paciente) {
       Integer id = pacientes.size()+1;
        pacientes.add(paciente);
        paciente.setId(id);
        LOGGER.info("Paciente agregado "+paciente);
        return paciente;
    }

    @Override
    public Paciente buscarPorCampo(String campo) {
        for(Paciente paciente:pacientes)
        {
            if(paciente.getId().equals(1))
            {
                System.out.println("");
            }
        }

        return null;
    }

    @Override
    public Paciente buscarPorid(Integer id) {
        return null;
    }
}
