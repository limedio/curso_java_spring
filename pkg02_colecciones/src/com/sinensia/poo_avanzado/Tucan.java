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
        System.out.println(nombre + " Volando voy!");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela distancias cortas");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come insectos");
    }
    
    
    
}
