/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

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

    public FechaSinMinutos() {
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FechaSinMinutos){
            FechaSinMinutos objFecha = (FechaSinMinutos)obj;
            if (this.get(YEAR) == objFecha.get(YEAR)
                && this.get(MONTH) == objFecha.get(MONTH)
                && this.get(DAY_OF_MONTH) == objFecha.get(DAY_OF_MONTH))   
                return true;
            } 
        
        return false;
     }
    
    
}
