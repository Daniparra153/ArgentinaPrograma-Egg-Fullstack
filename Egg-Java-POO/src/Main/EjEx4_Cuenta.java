/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4extra;

import Entidades.Cuenta;

/**
 *
 * @author danip
 */
public class EjEx4_Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1 = new Cuenta();
        c1.crearTitular();
        c1.retirarDinero();
        
    }
    
}
