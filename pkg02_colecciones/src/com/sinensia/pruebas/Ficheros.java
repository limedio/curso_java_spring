/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.io.FileWriter;
import java.io.IOException;

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
            fichero = new FileWriter("fichero_texto.txt");
            for (String linea : lineasTexto)
                fichero.write(linea + "\r\n");
            
        } catch (Exception ex) {
            System.err.println("Mensaje de error " + ex.getMessage());
        }finally{
            fichero.close();
            System.out.println("Fichero cerrado");
        }
    }
}
