/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

/**
 *
 * @author Admin
 */
public class TratamientoCadenas { 
    
    public static void pruebasString(){
        String quijote = "En un lugar de La Mancha...";
        if (quijote.contains("Mancha"))
            System.out.println("Contiene Mancha");
        if (quijote.contains("manCHa"))
            System.out.println("Contiene manCHa");
        else 
            System.out.println("No contiene manCHa");
        
        if (quijote.toLowerCase().contains("manCHa".toLowerCase()))
            System.out.println("Contiene manCHa - version minusculas");
        else 
            System.out.println("No contiene manCHa");
        
        
        if (quijote.startsWith("En un lugar"))
            System.out.println("Comienza por 'en un lugar'");
        if (quijote.endsWith("de La Mancha..."))
            System.out.println("Termina por 'de la Mancha...'");
         
         System.out.println("charAt(6) " + quijote.charAt(6));
        
         System.out.println(String.format("El texto es '%s' tiene '%d' caracteres", quijote, quijote.length()));
         
         System.out.println(String.format("%f; %.3f; %.2f €; %.0f; %f", 1.1f, 2.2f, 3.3f, 4.4f, 5.5f));
         
         System.out.println("Mancha está en la posición: " + quijote.indexOf("Mancha"));
         
         if (!quijote.isEmpty())
             System.out.println("quijote no está vacía");
         
         System.out.println("la última 'a' está en: " + quijote.lastIndexOf("a"));
         
         System.out.println("Trozo cadena " + quijote.substring(6, 14));
         
         String palabras[] = quijote.split(" ");
         for (String palabra : palabras){
             System.out.println("   PAL: " + palabra);
         }
         
         String strCsv  = "Luis, 667 555 345, aqui mismo, alumno";
         
          for (String dato : strCsv.split(",")){
             System.out.println("   Dato: " + dato.trim()); //quita espacios laterales.
         }
         
    } 
    
}
