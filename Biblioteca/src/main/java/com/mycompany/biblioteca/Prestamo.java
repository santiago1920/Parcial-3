package com.mycompany.biblioteca;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Prestamo {
    public Date fechaInicio, fechaFin;
    public Date calcularFechaFin(){
        long diffInMillies = Math.abs(fechaFin.getTime() - fechaInicio.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return new Date(fechaInicio.getTime() + diffInMillies);
    }
    public void generarMulta(){
        
    }
}
