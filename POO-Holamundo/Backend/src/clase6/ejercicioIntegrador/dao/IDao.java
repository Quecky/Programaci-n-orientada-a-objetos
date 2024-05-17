package clase6.ejercicioIntegrador.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao <T>{
    T registrar(T t) throws SQLException;
    T buscarPorID(Integer id) throws SQLException;
    List<T> buscarTodos() throws SQLException;
}
