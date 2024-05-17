package clase6.ejercicioIntegrador.service;

import clase6.ejercicioIntegrador.dao.IDao;
import clase6.ejercicioIntegrador.model.Paciente;

import java.sql.SQLException;
import java.util.List;

public class PacienteService {
   private IDao<Paciente> pacienteIDAO;

    public PacienteService(IDao<Paciente> pacienteIDAO) {
        this.pacienteIDAO = pacienteIDAO;
    }

    public Paciente registrarPaciente(Paciente paciente) throws SQLException {
        return pacienteIDAO.registrar(paciente);
    }

    public Paciente buscarPorId(Integer id) throws SQLException {
        return pacienteIDAO.buscarPorID(id);
    }

     public List<Paciente> buscarTodos() throws SQLException {
         return pacienteIDAO.buscarTodos();
     }
}
