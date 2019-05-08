/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class FechaSinMinutos extends GregorianCalendar {

    public FechaSinMinutos(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    FechaSinMinutos() {
       super();
    }

   
    //Sobreescribimos el método getTime(). No se puede porque el método getTime es final.
    public Date getTimeWithoutSeconds(){
        Date fecha = new Date(getTimeInMillis());
        fecha.setHours(0);
        fecha.setMinutes(0);
        fecha.setSeconds(0);
        return fecha;
    }
}
