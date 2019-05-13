/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class ProductoDAO implements InterfazDao<Producto>{
    
    HashMap<Long, Producto> mapa;

    public ProductoDAO() {
        mapa = new HashMap<>();
    }

        
    @Override
    public void poner(Producto producto) {
        if (producto == null){
            System.err.println("No se pueden añadir productos nulos");
        } else {
             mapa.put(producto.getId(), producto);
        }
    }
    
    @Override
    public Producto leerUno(long id) {
        if (mapa.containsKey(id)){
            return mapa.get(id);
        }
        System.err.println("Clave/ID no encontrado " + id);
        return null;
        
        
    }

    @Override
    public List<Producto> leerTodos() {
        ArrayList arrayProductos;
        arrayProductos = new ArrayList();
         for (Map.Entry<Long, Producto> entrada : mapa.entrySet()){
              arrayProductos.add(entrada);
              System.out.println("arrayProductos: " + arrayProductos.toString() + "key es: " + entrada.getKey() + " value es: " + entrada.getValue());
         }
          return arrayProductos;
    }

    @Override
    public void eliminar(Producto producto) {
         mapa.remove(producto.getId());
    }

    @Override
    public void eliminar(long id) {
        mapa.remove(id);
    }

    @Override
    public void modificar(Producto nuevoValorProducto) {
       mapa.put(nuevoValorProducto.getId(), nuevoValorProducto );
        System.out.println("modifico valor de producto " + nuevoValorProducto.getId() + " con el nombre : " + nuevoValorProducto.getNombre());
    }
    
}
