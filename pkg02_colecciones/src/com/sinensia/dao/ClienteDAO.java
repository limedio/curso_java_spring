/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class ClienteDAO implements InterfazDao<Cliente>{
    //La clase DAO para el cliente, recibe el tipo de dato Cliente. En la interfaz está como genérico para poder hacer esto y reutilizarla.
    HashMap<Long, Cliente> mapa;
    
    
    public ClienteDAO(){
        mapa = new HashMap<>();
    }
    public void poner(Cliente cli){
        if (cli == null){
            System.err.println("No se pueden añadir nulos");
        } else {
             mapa.put(cli.getId(), cli);
        }
    }
    
    public Cliente leerUno(long id){
        if (mapa.containsKey(id)){
            return mapa.get(id);
        }
        System.err.println("Clave/ID no encontrado " + id);
        return null;
    }

    @Override
    public void eliminar(Cliente cliente) {
       mapa.remove(cliente.getId());
    }

    @Override
    public void eliminar(long id) {
        mapa.remove(id);
    }

    @Override
    public List<Cliente> leerTodos() {
        ArrayList arrayClientes = new ArrayList();
         for (Map.Entry<Long, Cliente> entrada : mapa.entrySet()){
             // arrayClientes.set(0, entrada.getValue());
         }
          return arrayClientes;
    }

    @Override
    public void modificar(Cliente nuevoValor) {
        
        System.out.println("modifico valor de cliente " + nuevoValor.getId());
    }
    
    
}
