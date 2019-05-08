/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

/**
 *
 * @author Admin
 */
public class ProbandoHerencia {
            
       public static void probandoHerencia(){
           ClienteInvitado invitado = new ClienteInvitado(0, "Juan", null);
        
        
        invitado.setDuracionMaxima(10);
        System.out.println("Cliente: " + invitado.getNombre()
                + " duracion: " + invitado.getDuracionMaxima());
        
    }
}
    
 
