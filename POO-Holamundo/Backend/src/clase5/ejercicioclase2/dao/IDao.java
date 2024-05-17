package clase5.ejercicioclase2.dao;
//T es dato generico, cualquier tipo de dato
public interface IDao<T> {
    T registrar(T t);
    T buscarPorCampo(String campo);
    T buscarPorid(Integer id);


}
