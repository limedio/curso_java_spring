/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */
public class ClienteInvitado extends Cliente {
    //cuando construyo un hijo, de alguna manera tengo que llamar al constructor del padre
    public ClienteInvitado(long id, String nombre, String email) {
        super(id, nombre, email); //super es la clase padre. por lo tanto, llamo al constructor del padre.
    }
    
    private int duracionMaxima;

    /**
     * Get the value of duracionMaxima
     *
     * @return the value of duracionMaxima
     */
    public int getDuracionMaxima() {
        return duracionMaxima;
    }

    /**
     * Set the value of duracionMaxima
     *
     * @param duracionMaxima new value of duracionMaxima
     */
    public void setDuracionMaxima(int duracionMaxima) {
        this.duracionMaxima = duracionMaxima;
    }
        // Al heredar de cliente, puedo acceder a las variables de la clase padre: cliente, id y email:
    @Override //indico al compilador que estoy sobreescribiendo un método. Si no se pone, no pasa nada   
    public void mostrar(){
        //Sobreescritura del método mostrar de la clase padre     
        //Diferentes formas de recuperar el valor de las variables de clase:
        System.out.print("Invitado: " );
        super.mostrar();
        System.out.println("     Duración máxima: " + duracionMaxima);
        
    }
    
 

    /*
    Si quiero llamar al método mostrar de esta clase, llamaría :
    mostrar();
    Si quiero llamar al método mostrar de la clase padre, el que he sobreescrito, llamo:
    super.mostrar();
    */

}
