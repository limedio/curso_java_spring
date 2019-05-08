 
package com.sinensia.pruebas;

import com.sinensia.FechaSinMinutos;
import java.util.Date;
import java.util.GregorianCalendar;


public class Fechas {
    //Metodo estático. Función externa que no tiene que ver con la clase, son funciones generales que hacen cosas generales que no tienen 
    //nada que ver con la aplicación.
    
    public static void probar(){
        FechaSinMinutos fecha = new FechaSinMinutos();
        fecha.set(2019, 6, 2);
        System.out.println("Fecha: " + fecha.toString());
        Date fechaDate = fecha.getTime();
        System.out.println("Fecha: " + fechaDate.toString());
        
        FechaSinMinutos miCumple;
        miCumple = new FechaSinMinutos(2019, 6, 2);
            
        
        
        
        if (miCumple.getTimeWithoutSeconds().after(fecha.getTimeWithoutSeconds())){
            System.out.println("Aun no cumples");
        } else if (miCumple.getTimeWithoutSeconds().before(fecha.getTimeWithoutSeconds())){
            System.out.println("Ya cumpliste");
        }else if (miCumple.equals(fecha)){
            System.out.println("¡Cumpleaños feliz!");
        }
        
       
        
        }
}
