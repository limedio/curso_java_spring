/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;

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
        
        repoCli.leerTodos();
        repoCli.modificar(new Cliente(1, "AnaModificado", "aaammm@aa.es"));
        
    }
}
