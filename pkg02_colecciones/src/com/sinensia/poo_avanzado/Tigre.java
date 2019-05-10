package com.sinensia.poo_avanzado;

/**
 *
 * @author Admin
 */
public class Tigre extends Animal{

    public Tigre(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " corre veloz");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " salta, pero no vuela");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come otros animales");
    }
    
}
