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
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Colecciones {
    
    private static ArrayList<Cliente> arrayListaClientes;
    
    public static void comparaciones(){
        Cliente luis = new Cliente(2, "Luis", "luis@aa.com");
        Cliente bea = new Cliente(3, "Bea", null);
        if (bea.compareTo(luis)<0)
            System.out.println("BEA es menor que LUIS");
        else if (bea.compareTo(luis)==0)
            System.out.println("BEA es igual que LUIS");
        else if (bea.compareTo(luis)>0)
            System.out.println("BEA es mayor que LUIS");
    }
    
    
    public static void ejemploHashMap(){
      HashMap<String, Cliente> diccionarioClientes;
        diccionarioClientes = new HashMap<String, Cliente>();
        Cliente ana = new Cliente(1, "Ana", "ana@aa.com");
        Cliente luis = new Cliente(2, "Luis", "luis@aa.com");
        Cliente bea = new Cliente(3, "Bea", null);
        
        diccionarioClientes.put("a1", ana);
        diccionarioClientes.put("b2", luis);
        diccionarioClientes.put("c3", bea);
        
        System.out.println("Bea? "+ diccionarioClientes.get("c3").getNombre());
                
        if (diccionarioClientes.containsKey("c3")){
          diccionarioClientes.put("c3", new Cliente(4, "Pedro", null));
        }
        
         System.out.println("Bea? "+ diccionarioClientes.get("c3").getNombre());
         
         //recorrer un hashmap. Bucle foreach
         for (Map.Entry<String, Cliente> parClaveValor 
                 : diccionarioClientes.entrySet()){
         
             System.out.println("Cliente "+ parClaveValor.getKey());
             Cliente cliente = parClaveValor.getValue();
             System.out.println(" Nombre: " + cliente.getNombre());
         }
         
         //Ejemplo Mapas con tipos genéricos: Date, Cliente
         Map<Date, Cliente> mapClientesFecha = new TreeMap<Date, Cliente>();
         mapClientesFecha.put(new Date(82, 4, 9), luis);
         mapClientesFecha.put(new Date(81, 4, 9), new Cliente(7, "Fulano", "aa@bb.es"));
         mapClientesFecha.put(new Date(82, 9, 19), new Cliente(8, "Mengano", "mm@bb.es"));
         mapClientesFecha.put(new Date(80, 7, 10), diccionarioClientes.get("c3"));
        
         System.out.println("\n\n*******Mapa ordenado por fecha********\n");
         for (Map.Entry<Date, Cliente> entrada : mapClientesFecha.entrySet()){
         
             System.out.println("\n - Clave:  "+ entrada.getKey().toString());
             System.out.println("  Valor: " + entrada.getValue().toString());
         }
         
} 
    public static void ejemploListas(){
     ArrayList<Cliente> listaClientes;
        listaClientes = new ArrayList();
        listaClientes.add(new Cliente(1, "Ana", "ana@aa.com"));
        listaClientes.add(new Cliente(2, "Luis", "luis@aa.com"));
        listaClientes.add(new Cliente(3, "Bea", null));
        
        
        //Eliminamos elemento Bea de la lista
        listaClientes.remove(1);
     
        
        Cliente bea = listaClientes.get(1);
        bea.setEmail("bea@aa.com");
        
        for (int i=0; i < listaClientes.size(); i++)
        {
            System.out.println("Cliente " + i + ": " 
                    + listaClientes.get(i).getNombre()
                    + " email " + i + ": " 
                    + listaClientes.get(i).getEmail());
        }
    
        //recorrer un arraylist equivalente al for anterior (bucle foreach. Por cada elemento del array, creo un objeto cliente en cada iteración
         for (Cliente cliente : listaClientes) {
            System.out.println("Cliente: " + cliente.getNombre() );
        }
    }
    public static void ejemploSet(){
        
        //Conjunto de elementos únicos. No permite duplicados y los guarda sin orden.
        HashSet<Cliente> conjuntoClientes = new HashSet<Cliente>();
        conjuntoClientes.add(new Cliente(1, "juan", null));
        conjuntoClientes.add(new Cliente(2, "juan", null));
        Cliente clientePepe = new Cliente(3, "pepe", null);
        
        conjuntoClientes.add(clientePepe);
        conjuntoClientes.add(clientePepe);
        
        
        for (Cliente cli : conjuntoClientes) {
            cli.mostrar();
        }
    }
    
  
    


    
}
