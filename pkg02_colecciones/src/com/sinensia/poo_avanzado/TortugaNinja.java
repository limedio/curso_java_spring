
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
        //lanzo esta excepción para indicar que no se permite esta operación
        System.err.println(nombre + " No puedes volar");
         //throw new UnsupportedOperationException("Exception: No puedes volar"); 
   }

    @Override
    public void comer() {
        System.out.println(nombre + " come pizza");
    }

    @Override
    public void saludarAlPropietario() {
       System.out.println("Hola " + propietario.getNombre() + " soy el " + nombre);
    }

 
    
   
}
