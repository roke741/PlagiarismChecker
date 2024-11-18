package com.roke.plagiarismchecker.model.dao.interfaces;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public interface IDAO<T> {
    void insertar(T entidad);
    void actualizar(T entidad);
    void eliminar(T entidad);
    List<T> consultarTodos();
}