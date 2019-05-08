package pkg02_colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejemploHashMap();
        //Array no genérico: puede guardar cualquier tipo de datos. NO USAR 
        //hay que indicar el tipo de dato que podemos guardar.
        /*ArrayList listaClientes;
        listaClientes = new ArrayList();
        listaClientes.add(10);
        listaClientes.add("Texto");
        listaClientes.add(new Cliente(1, "Ana", "ana@aa.com"));*/
        ProbandoFechas.probar();
        probandoHerencia();
    }
    
    //Hashmap funciona por clave y valor.
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
    
     //Arraylist funciona por indices
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
    public static void probandoHerencia() {
        ClienteInvitado invitado = new ClienteInvitado(0, "Juan", null);
        invitado.setDuracionMaxima(10);
        System.out.println("Cliente: " + invitado.getNombre()
                + " duracion: " + invitado.getDuracionMaxima());
        
    }
     
    
}
