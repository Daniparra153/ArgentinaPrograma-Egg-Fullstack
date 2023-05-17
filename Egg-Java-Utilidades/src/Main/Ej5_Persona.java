/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Persona;
import Servicios.personaServicios;


/**
 *
 * @author danip
 */
public class Ej5_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        personaServicios ps = new personaServicios();
        Persona p1 =  ps.crearPersona();
        System.out.println("La edad de " + p1.getNombre() + " es  de: " +  ps.calcularEdad());
        ps.menorQue(p1);
        ps.mostrarPersona(p1);
       
    }
}
