/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import com.sinensia.Producto;

/**
 *
 * @author Admin
 */
public class ProbandoDAO {
    public static void probarCliente(){
        ClienteDAO repoCli = new ClienteDAO();
        repoCli.poner(new Cliente(1, "Ana", "aaa@aa.es"));
        //Se pueden añadir objetos de tipo ClienteInvitado porque heredan de Cliente.
        repoCli.poner(new ClienteInvitado(2, "Juan", "juan@aa.es"));
        repoCli.poner(new ClienteInvitado(3, "Bea", "bea@aa.es"));
        System.out.println("Juan: " + repoCli.leerUno(2).toString());
         
        repoCli.eliminar(1);
        repoCli.leerTodos();
        repoCli.modificar(new Cliente(1, "AnaModificado", "aaammm@aa.es"));
        
    }
    
    public static void probarProducto(){
        ProductoDAO repoProducto = new ProductoDAO();
        repoProducto.poner(new Producto(1, "producto1", 100));
        repoProducto.poner(new Producto(2, "producto2", 200));
        repoProducto.poner(new Producto(3, "producto3", 300));
        
        repoProducto.leerTodos();
        repoProducto.modificar(new Producto(3, "producto3modif", 150));
        Producto pro = repoProducto.leerUno(3);
        System.out.println("Producto modificado: " + pro.toString());
    }
}
