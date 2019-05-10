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
public class Perro extends Mascota{

    public Perro(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " corre detrás del gato");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " no vuela");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come pienso");
    }
    
}
