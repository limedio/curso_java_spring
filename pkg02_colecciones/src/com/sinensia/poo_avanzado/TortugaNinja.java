
package com.sinensia.poo_avanzado;

/**
 *
 * @author Admin
 */
public class TortugaNinja extends Mascota{

    public TortugaNinja(String nombre, float tamanho) {
        super(4, true, true, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " Salto mortal de edificio");
    }

    @Override
    public void volar() {
        System.out.println(nombre + ", no puedes volar");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come pizza");
    }
    
   
}
