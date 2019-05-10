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
public class ProbandoAnimales {
    
    public static void probarClasesAbstractas(){
        Tucan unTucan = new Tucan("Turigualpa", 15.8F);
        unTucan.mover();
        unTucan.comer();
        unTucan.volar();
        
        Cliente yo = new Cliente(3, "Luis", null);
        Animal miDragon = new Dragon("Drogo", 4959);
        Mascota miMascota = (Mascota)miDragon;
        miMascota.setPropietario(yo);
        //Hago un casting explicito, se podría hacer paso intermedio de crear objeto mascota y luego casting
        ((Mascota) miDragon).saludarAlPropietario();
        ((Mascota) miDragon).pedirComida();
        miDragon.volar();
         //Llamo a los metodos que implementan las interfaces. Es necesario hacer un casting para acceder a los métodos propios de la interface.
        ((Depredador) miDragon).cazar("conejo");
        ((Mamifero) miDragon).mamar();
         
        Dragon otroDragon = new Dragon("otroDragon", 2222);
        Tigre otroTigre = new Tigre("otroTigre", 5335);
        
        //El tigre mama del dragon
        otroTigre.mamar(otroDragon);
         
        //El dragon mama del tigre
        otroDragon.mamar(otroTigre);
         
        TortugaNinja michelangelo = new TortugaNinja("Michelangelo", 157.5F);
        michelangelo.mover();
        michelangelo.comer();
        michelangelo.volar();
        //Para llamar al metodo saludar al propietario, tengo que opner el casting explicito
        ((Mascota) miMascota).saludarAlPropietario();
        
        Tigre unTigre = new Tigre("Tigreton", 150.4F);
        unTigre.mover();
        unTigre.comer();
        unTigre.volar();
        
        Perro unPerro = new Perro("Scooby", 200F);
        unPerro.mover();
        unPerro.comer();
        unPerro.volar();
        //No puedo poner unPerro.SaludoarAlPropietario() porque el metodo saludarAlPropietario  es abstracto
        //y lo implementa la clase Mascota, por lo tanto, tengo que darle forma de Mascota para poder acceder al método sobreescrito (e implementado) 
        //por cada clase concreta de mascotas (Dragon, perro, tortuganinja)
     
        
        
    }
    
}
