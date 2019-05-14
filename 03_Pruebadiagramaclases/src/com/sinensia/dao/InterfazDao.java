package com.sinensia.dao;

public interface InterfazDao {

    T poner(T valor);

    long leerUno(long id);

    List<T> leerTodos();

    T eliminar(T valor);

    long eliminar(long id);

    T modificar(T nuevoValor);
}
