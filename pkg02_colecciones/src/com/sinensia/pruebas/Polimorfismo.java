/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import com.sinensia.ClienteVip;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Polimorfismo {
    public static void polimorfeando(){
        ClienteInvitado invitado;
        invitado = new ClienteInvitado(0, "Juan", null);
        invitado.setDuracionMaxima(10);
        invitado.mostrar();
        
        //Este es un objeto de tipo clienteInvitado con la forma de Cliente.
        Cliente clienteNormal = invitado;
        clienteNormal.mostrar();
        //System.out.println("Nombre: " + clienteNormal.getNombre());
        
        /*Cliente normal = new Cliente(0, "Tu", null);
        //Se lanza una excepción por polimorfismo: no se puede convertir un padre con la forma de un hijo
        ClienteInvitado normalEnIvit = (ClienteInvitado) normal;
        System.out.println("Duracion: " + normalEnIvit.getDuracionMaxima());*/
        
       
    }
    
    public static void polimorfeandoConListas(){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente(1, "Ana", "ana@aa.com"));
        clientes.add(new Cliente(2, "Juan", "juan@aa.com"));
        clientes.add(new ClienteInvitado(3,"Bea", "bea@aa.com"));
        clientes.add(new ClienteInvitado(4, "Luis", "luis@aa.com"));
        clientes.add(new ClienteVip(5, "Aria", "aria@aa.com", "hola"));
    
        System.out.println("**Polimorfeando con Listas");
         for (Cliente cliente : clientes)
        {
           cliente.mostrar();
        }
        
        
        System.out.println("*****************Polimorfeando con Maps*************");  
        
        //Puedo hacer HashMap o TreeMap
        //HashMap<String, Cliente> diccClientes;
        //diccClientes = new HashMap<String, Cliente>();
        TreeMap<String, Cliente> diccClientes;
        diccClientes = new TreeMap<String, Cliente>();
        for (Cliente cliente : clientes) {
           diccClientes.put(cliente.getNombre(), cliente);
        }
        //Modifico un cliente en dos lineas
        Cliente clienteAna = diccClientes.get("Ana");
        clienteAna.setEmail("ana@bb.es");
        
        //Modifico un invitado 
        ClienteInvitado clienteInvitado = (ClienteInvitado)diccClientes.get("Bea");
        clienteInvitado.setDuracionMaxima(clienteInvitado.getDuracionMaxima()+10);
        
        //Modifico un cliente VIP
        ClienteVip clienteVip = (ClienteVip)diccClientes.get("Aria");
        clienteVip.setBeneficio("beneficio Aria");
        
        for (Map.Entry<String, Cliente> entradaCliente : diccClientes.entrySet()) {
             String clave = entradaCliente.getKey();
             System.out.println("Clave: " + clave);
             Cliente valor = entradaCliente.getValue();
             
             //Modificar todos los invitados y sumarle 1
             if (valor instanceof ClienteInvitado){
                 ClienteInvitado cli = (ClienteInvitado)valor;
                 cli.setDuracionMaxima(cli.getDuracionMaxima()+10);
             }else if (valor instanceof ClienteVip){
                 ClienteVip cliVip = (ClienteVip)valor;
                 cliVip.setBeneficio(cliVip.getBeneficio()+ ", copas gratis");
             }
             
             
             
             
             valor.mostrar();
 
        }
}   
}
