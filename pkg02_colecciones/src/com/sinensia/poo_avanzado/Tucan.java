package com.sinensia.poo_avanzado;

/**
 *
 * @author Admin
 */
public class Tucan extends AnimalSalvaje{

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
