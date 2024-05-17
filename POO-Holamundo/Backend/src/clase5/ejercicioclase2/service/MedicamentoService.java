package clase5.ejercicioclase2.service;

import clase5.ejercicioclase2.dao.IDao;
import clase5.ejercicioclase2.model.Medicamento;

public class MedicamentoService {
    private IDao<Medicamento> medicamentoIDao;

    public void setMedicamentoIDao(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento registrar(Medicamento medicamento)
    {
      return medicamentoIDao.registrar(medicamento)  ;
    }

    public Medicamento buscarPorNombre(String nombre)
    {
        return medicamentoIDao.buscarPorCampo(nombre);
    }

}
