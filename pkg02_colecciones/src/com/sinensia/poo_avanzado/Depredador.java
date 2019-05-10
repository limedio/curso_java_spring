/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzado;

/**
 *
 * @author Admin
 */
//Todos los métodos son abstractos!!!!
public interface Depredador {
   //Aunque lo permite java, no es recomendable que una interface tenga propiedades. Debería contener sólo métodos.
    
    
    void cazar(String presa);
    
}
