/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Servicios.FechaServicios;
import java.util.Date;

/**
 *
 * @author danip
 */
public class Ej4_Fecha_se {

    /**
     * @param args the command line arguments
     */

        public static void main(String[] args) {
        FechaServicios fechaService = new FechaServicios();
        Date fechaNacimiento = fechaService.fechaNacimiento();
        Date fechaActual = fechaService.fechaActual();
        int edad = fechaService.diferencia(fechaNacimiento, fechaActual);
        System.out.println("La edad del usuario es " + edad + " años.");
    }
}

