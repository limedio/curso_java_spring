 
package pkg02_colecciones;

import java.util.Date;
import java.util.GregorianCalendar;


public class ProbandoFechas {
    
 
    //Metodo estático. Función externa que no tiene que ver con la clase, son funciones generales que hacen cosas generales que no tienen 
    //nada que ver con la aplicación.
    
    public static void probar(){
        GregorianCalendar fecha = new GregorianCalendar();
        fecha.set(2019, 5 ,8);
        System.out.println("Fecha: " + fecha.toString());
        Date fechaDate = fecha.getTime();
        System.out.println("Fecha: " + fechaDate.toString());
    }
}
