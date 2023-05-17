/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mscotapp;


import mascotapp.Entidades.Mascota;

/**
 *
 * @author danip
 */
public class Mascotapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       
       Mascota m1 = new Mascota("Fernando Chiquito", "chiquito", "Perro");
       
        System.out.println(m1);
       
       m1.setNombre("pepe chiquito");
        System.out.println(m1.getNombre());
       
        System.out.println();
       
       m1.pasear(100);
       
        System.out.println(m1.toString());
        
    }

    
}
