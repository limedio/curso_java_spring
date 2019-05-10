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
public class Tucan extends Animal{

    public Tucan(String nombre, float tamanho) {
        super(2, true, false, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println("Volando voy!");
    }
    
    
    
}
