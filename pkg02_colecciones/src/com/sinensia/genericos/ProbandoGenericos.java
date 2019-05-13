package com.sinensia.genericos;


import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ProbandoGenericos {
    
    public static void probarMetodo(){
        int num = 10;
        Integer objNum = new Integer(10);
        num= 11;
        String texto = "" + String.valueOf(num);
        String texto2 = "" + objNum.toString();
        
       
        ArrayList<Integer> listaInt = new ArrayList<>();
        insertarDoble(listaInt, 10);
        insertarDoble(listaInt, 15);
        System.out.println("Enteros: " + listaInt.toString());
        
        ArrayList<String> listaStr = new ArrayList<>();
        insertarDoble(listaStr, "texto 1");
        insertarDoble(listaStr, "texto 2");
        System.out.println("String : " + listaInt.toString()); 
        
        
        
        //Ejemplo de llamada a metodos con tipo String y generico y ver que el comportamiento es el mismo.
        //El código anterior se puede hacer utilizando el código del tipo genérico:
         ArrayList<String> listaStrGenerico = new ArrayList<>();
        insertarDobleGenerico(listaStrGenerico, "texto 1");
        insertarDobleGenerico(listaStrGenerico, "texto 2");
        System.out.println("String generico : " + listaInt.toString()); 
        
        ArrayList<Date> listaDate = new ArrayList<>();
        insertarDobleGenerico(listaDate, new Date(82, 4, 10));
        insertarDobleGenerico(listaDate, new Date(84, 9, 20));
        System.out.println("Fechas: " + listaDate.toString());
        
    }
    
    
    
    public static void insertarDoble(ArrayList<Integer> lista, int valor){
        lista.add(valor);
        lista.add(valor);
    }
    
    public static void insertarDoble(ArrayList<String> lista, String valor){
        lista.add(valor);
        lista.add(valor);
    }
    

    
    //como el cuerpo del método es el mismo, podemos crear un metodo generico
    
        public static<Clase> void insertarDobleGenerico(ArrayList<Clase> lista, Clase valor){
        lista.add(valor);
        lista.add(valor);
    }
}
