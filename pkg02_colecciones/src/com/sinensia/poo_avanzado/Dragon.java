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
public class Dragon extends Mascota implements Depredador, Mamifero{

    public Dragon( String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }
    
    public Dragon( String nombre, float tamanho, int patas) {
        super(patas, true, false, nombre, tamanho);
    }
  
    @Override
    public void comer() {
        System.out.println(nombre + " quema y luego te come");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela, te quema y te come");
    }

    @Override
    public void mover() {
         System.out.println(nombre + " se mueve asustando a la peña");
    }

    @Override
    public void saludarAlPropietario() {
       System.out.println("Hola " + propietario.getNombre() + " soy el " + nombre);
    }

    @Override
    public void cazar(String presa) {
        System.out.println( nombre  + " quema, vuela y caza a  " + presa);
    }

    @Override
    public void mamar() {
        System.out.println( nombre  + " mama porque es mamífero");
    }

    @Override
    public String mamar(Mamifero mamoDe) {
        Animal miAnimal = (Animal)mamoDe;
        System.out.println("Ahora es el " +  nombre  + " el que mama de " + miAnimal.getNombre());
        return miAnimal.getNombre();
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
