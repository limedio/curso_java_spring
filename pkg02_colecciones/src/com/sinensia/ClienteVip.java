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
public class ClienteVip extends Cliente{
    
    private String beneficios;

    public ClienteVip(long id, String nombre, String email, String beneficios) {
        super(id, nombre, email);
        this.beneficios = beneficios;
    }

    /**
     * Get the value of beneficio
     *
     * @return the value of beneficio
     */
    public String getBeneficio() {
        return beneficios;
    }

    /**
     * Set the value of beneficio
     *
     * @param beneficio new value of beneficio
     */
    public void setBeneficio(String beneficio) {
        this.beneficios = beneficio;
    }
    
     @Override //indico al compilador que estoy sobreescribiendo un método. Si no se pone, no pasa nada   
    public void mostrar(){
        //Sobreescritura del método mostrar de la clase padre     
        //Diferentes formas de recuperar el valor de las variables de clase:
        System.out.print("Cliente VIP: " );
        super.mostrar();
        System.out.println("    Beneficio: " + beneficios);
        
    }

}
