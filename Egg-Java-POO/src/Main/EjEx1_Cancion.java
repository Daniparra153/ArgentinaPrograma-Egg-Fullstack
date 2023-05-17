/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1extra;

import Entidades.Cancion;

/**
 *
 * @author danip
 */
public class EjEx1_Cancion {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Jorje Rojas", "vuelvo");

        cancion1.setTitulo("Imagine");
        cancion1.setAutor("John Lennon");

        System.out.println("Canción 1: " + cancion1.getTitulo() + " - " + cancion1.getAutor());
        System.out.println("Canción 2: " + cancion2.getTitulo() + " - " + cancion2.getAutor());
    }

}
