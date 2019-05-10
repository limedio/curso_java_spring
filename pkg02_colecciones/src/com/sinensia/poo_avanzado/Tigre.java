package com.sinensia.poo_avanzado;

/**
 *
 * @author Admin
 */
public class Tigre extends AnimalSalvaje implements Depredador, Mamifero{ 

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

    @Override
    public void cazar(String presa) {
        System.out.println( nombre  + " salta y devora a  " + presa);
    }

    @Override
    public void mamar() {
        System.out.println( nombre  + " mama porque es mamífero");
    }

 
    public String mamar(Mamifero mamoDe) {
        Animal miAnimal = (Animal)mamoDe;
        System.out.println("Este " +  nombre  + " mama de " + miAnimal.getNombre());
        return miAnimal.getNombre();
    }
}
