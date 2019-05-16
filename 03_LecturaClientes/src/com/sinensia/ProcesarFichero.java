/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProcesarFichero {
   
        public static void procesarFichero(){
            File fichRutaRelativa = new File("ejercicioFicheros.txt");
            Scanner escaner = null;
            try {
                escaner = new Scanner(fichRutaRelativa);
                while (escaner.hasNextLine()){
                    String linea = escaner.nextLine();
                    if (linea.isEmpty() ) 
                        System.out.println("la linea está vacía");
                    else if (linea.indexOf("----") != -1)
                        System.out.println("línea con '----' no valida");
                    else{   
                       String palabras[] = linea.split(",");
                      // for (int i = 0; i < palabras.length; i++){
                           if (palabras.length == 4 || palabras.length == 5){
                                //System.out.println("palabras contiene: " + palabras[i]);
                                String id = palabras[0];
                                String nombre = palabras[1];
                                String email = palabras[2];  
                                 
                                 
                                
                                Cliente unCliente;
                                
                                if (palabras.length == 5){
                                    unCliente = new ClienteInvitado(Integer.valueOf(id), nombre, email);
                                    ((ClienteInvitado) unCliente).setDuracionMaxima(Integer.valueOf(palabras[4]));
                                     
                                }else{
                                    unCliente = new Cliente(Integer.valueOf(id), nombre, email);
                                }
                                System.out.println("unCliente :  ------ " + unCliente.toString());
                                HashMap<String, Cliente> textoFichero;
                                textoFichero = new HashMap<String, Cliente>();
                                textoFichero.put(id, unCliente);
                           }
                       // }

                    }
                    
                }
            }catch (Exception ex){
                System.out.println("Mensaje: " + ex.getMessage());            
            } finally {
                try{
                    if (escaner != null){
                        escaner.close();
                    }
                }catch (Exception ex2){
                    System.err.println("Mensaje al cerrar: " + ex2.getMessage());
                }
            }
    }
}
