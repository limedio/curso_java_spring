package com.sinensia.dao;

public class GenericoDAO implements InterfazDao {

    HashMap<Long, T> mapa;

    public GenericoDAO() {
    }

    public T poner(T cli) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long leerUno(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public T eliminar(T cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long eliminar(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<T> leerTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public T modificar(T nuevoValor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
