/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import POOEJ2.Entidades.Circunferencia;

/**
 *
 * @author danip
 */
public class Ej2_circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circunferencia c=new Circunferencia(0);
        c.crearCircunferencia();
        //c.setRadio(15);
       // System.out.println(c.getRadio());
        System.out.println("Area: "+c.area());
        System.out.println("Perimetro: "+ c.perimetro());
        
    }
    
}
