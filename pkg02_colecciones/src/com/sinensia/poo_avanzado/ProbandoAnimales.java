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
public class ProbandoAnimales {
    
    public static void probarClasesAbstractas(){
        Tucan unTucan = new Tucan("Turigualpa", 15.8F);
        unTucan.mover();
        unTucan.comer();
        unTucan.volar();
        
        TortugaNinja michelangelo = new TortugaNinja("Michelangelo", 157.5F);
        michelangelo.mover();
        michelangelo.comer();
        michelangelo.volar();
        
        Tigre unTigre = new Tigre("Tigreton", 150.4F);
        unTigre.mover();
        unTigre.comer();
        unTigre.volar();
        
        Perro unPerro = new Perro("Scooby", 200F);
        unPerro.mover();
        unPerro.comer();
        unPerro.volar();
        
        
    }
    
}
