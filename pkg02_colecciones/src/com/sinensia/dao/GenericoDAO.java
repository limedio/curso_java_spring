/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;


import com.sinensia.Entidad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class GenericoDAO<T extends Entidad> 
        implements InterfazDao<T>{

    
    HashMap<Long, T> mapa;
    
    
    public GenericoDAO(){
        mapa = new HashMap<>();
    }
    public void poner(T cli){
        if (cli == null){
            System.err.println("No se pueden añadir nulos");
        } else {
             mapa.put(cli.getId(), cli);
        }
    }
    
    public T leerUno(long id){
        if (mapa.containsKey(id)){
            return mapa.get(id);
        }
        System.err.println("Clave/ID no encontrado " + id);
        return null;
    }

    @Override
    public void eliminar(T cliente) {
       mapa.remove(cliente.getId());
    }

    @Override
    public void eliminar(long id) {
        mapa.remove(id);
    }

    @Override
    public List<T> leerTodos() {
        ArrayList<T> arrayTs;
        arrayTs = new ArrayList<T>();
         for (Map.Entry<Long, T> entrada : mapa.entrySet()){
              arrayTs.add(entrada.getValue());
              System.out.println("arrayTs: " + arrayTs.toString() + "key es: " + entrada.getKey() + " value es: " + entrada.getValue());
         }
          return arrayTs; //Cast implicito.
    }

    @Override
    public void modificar(T nuevoValor) {
        mapa.replace(nuevoValor.getId(), nuevoValor);
    }
    
}
