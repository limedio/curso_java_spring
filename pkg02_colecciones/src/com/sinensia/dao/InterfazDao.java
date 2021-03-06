/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import java.util.List;

/**
 * Interfaz Data Access Object para toda la app
 * @author Admin
 * @param <T> Entidad para interfaz DAO
 */
public interface InterfazDao<T> {
    //Creamos métodos con tipos genéricos para que nos sirvan para Clientes, productos.... para ello, defino la interfaz como InterfazDao<T>
    void poner(T valor);
    T leerUno(long id);
    List<T> leerTodos();
    void eliminar (T valor);
    void eliminar (long id);
    void modificar(T nuevoValor);
}
