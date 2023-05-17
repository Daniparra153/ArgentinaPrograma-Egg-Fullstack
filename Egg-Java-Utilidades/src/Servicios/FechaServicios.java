/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author danip
 */
public class FechaServicios {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Ingrese el dia: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que nació: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año que nació: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return fecha;
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Date fecha, Date fechaActual) {
        LocalDate localFecha = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localFechaActual = fechaActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period periodo = Period.between(localFecha, localFechaActual);
        return periodo.getYears();
    }

}

/*
public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2000, 5, 8);
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edad = periodo.getYears();
        
        System.out.println("La edad del usuario es " + edad + " años.");
    }
}
*/
