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
    
    private String beneficio;

    public ClienteVip(long id, String nombre, String email) {
        super(id, nombre, email);
    }

    /**
     * Get the value of beneficio
     *
     * @return the value of beneficio
     */
    public String getBeneficio() {
        return beneficio;
    }

    /**
     * Set the value of beneficio
     *
     * @param beneficio new value of beneficio
     */
    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

}
