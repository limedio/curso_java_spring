/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class PruebasColecciones {
    static void ejemploHashMap(){
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
}
    static void ejemploListas(){
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
}
