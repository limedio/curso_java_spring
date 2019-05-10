/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;

/**
 *
 * @author Admin
 */
public abstract class Mascota extends Animal {
    //como Mascota es clase abstracta, no tiene por qué implementar los métodos de la clase abstracta Animal de la que hereda.
    protected Cliente propietario;
    
    
    public Mascota(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        super(patas, aerobico, acuatico, nombre, tamanho);
    }

    //Aunque sea una clase abstracta, puede tener métodos que no lo sean, que se comparten entre todas las clases que implementan
    //esta clase abstracta (mascota):
    public void pedirComida(){
        System.out.println(propietario.getNombre() + " ¡quiero comida!");
    }
    
    //Tambien puedo tener métodos abstractos que deben ser implementados por todas las clases que implementan esta clase:
    public abstract void saludarAlPropietario();
    
    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    
    
    
}
