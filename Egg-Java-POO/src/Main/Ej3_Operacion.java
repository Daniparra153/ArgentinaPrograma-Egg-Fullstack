/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

import java.util.Scanner;
import pooej3.Entidades.Operacion;

/**
 *
 * @author danip
 */
public class Ej3_Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
Scanner leer = new Scanner(System.in);
        Operacion op = new Operacion(); // Crear objeto Operacion sin atributos
//        op.crearOperacion(); // Pide al usuario los dos números y los guarda en los atributos del objeto
        op.crearOperacion(); // Mensaje pidiendo al usuario los dos números
//        float num1 = leer.nextFloat();
//        float num2 = leer.nextFloat();
        op.setNum1(leer.nextDouble());
        op.setNum2(leer.nextDouble());
        
        System.out.println(" ");
        
        System.out.println("La suma de: " + op.getNum1() + " y " + op.getNum2() + " es: "+ op.sumar());
        
        System.out.println("La resta es: " + op.getNum1() + " y " + op.getNum2() + " es: "+ op.restar());
      
        if(op.getNum1() == 0 || op.getNum2() == 0){              System.err.println("No se puede realizar multiplicaciones con 0");  }
        else{        System.out.println("La multiplicación es: " + op.getNum1() + " y " + op.getNum2() + " es: "+ op.multiplicar());    }
        
        if(op.getNum2() == 0){                 System.err.println("No se puede realizar divsiones en 0");   }   
        else{   System.out.println("La división es: " + op.getNum1() + " y " + op.getNum2() + " es: "+ op.dividir());   }
    }
        
}