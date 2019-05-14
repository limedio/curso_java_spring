/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ficheros {
    
    public static void probarEscritura() throws IOException {
        String[] lineasTexto = {
            "Linea primera",
            "Linea segunda",
            "Tercera línea"};

        FileWriter fichero = null;

        try {
            fichero = new FileWriter("fichero_texto.txt" /*si quiero añadir lineas, paso parámetro true*/);
            for (String linea : lineasTexto)
                fichero.write(linea + "\r\n");
            
        } catch (Exception ex) {
            System.err.println("Mensaje de error " + ex.getMessage());
        }finally{
            fichero.close();
            System.out.println("Fichero cerrado");
        }
    }
    public static void escrituraStream(){
            String[] lineasTexto = {
            "F2Linea primera",
            "Linea segunda",
            "Tercera línea"};
            Writer out = null;
            
            try{
                FileOutputStream streamFich;
                streamFich = new FileOutputStream("fich2.txt");
                OutputStreamWriter streamWriter;
                streamWriter = new OutputStreamWriter(streamFich, "UTF-8");
                out= new BufferedWriter(streamWriter);
                out = new BufferedWriter(
                        new OutputStreamWriter(
                            new FileOutputStream("fich_2.txt"),
                            "UTF-8"));
                for (String linea : lineasTexto){
                    try{
                        out.write(linea + "\r\n");
                    }catch ( IOException ex){
                        System.err.println("Error al escribir fichero: " + ex.getMessage());
                    }
                }
                
            }catch (UnsupportedEncodingException | 
                    FileNotFoundException ex2) {
                System.out.println("Error 2: "
                + ex2.getMessage());
            }finally{
                try{
                    out.close();
                    System.out.println("Fichero ha sido cerrado");
                }catch (IOException ex3){
                    System.err.println("Error en cierre de fichero: " + ex3.getMessage());
                } 
            }
    }
    
    public static void lecturaFich(){
            File fichFormWin = new File("C:\\Users\\Admin\\Desktop\\CURSO_JAVA\\escuela_java_spring.git\\pkg02_colecciones\\fichero_texto.txt");
            File ficFormJava = new File("C:/Users/Admin/Desktop/CURSO_JAVA/escuela_java_spring.git/pkg02_colecciones/fichero_texto.txt");
            File ficRutaRelativa = new File("fichero_texto.txt");
            Scanner escaner = null;
            try {

                System.out.println("Leyendo fichero ");
                escaner = new Scanner(fichFormWin);
                while (escaner.hasNextLine()){//hasta el siguiente \n
                    String linea = escaner.nextLine();
                    System.out.println(">>>>>>\"" + linea + "\"");
                    if (linea.compareTo("Linea segunda")<0)
                        System.out.println("     Es menor");
                    else if (linea.compareTo("Linea segunda")>0)
                        System.out.println("     Es mayor");
                    else
                        System.out.println("     Es igual");
                    
                    
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
