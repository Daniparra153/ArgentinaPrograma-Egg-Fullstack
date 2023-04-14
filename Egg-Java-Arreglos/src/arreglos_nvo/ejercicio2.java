/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_nvo;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author danip
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un número a buscar en el vector. 
        El programa mostrará dónde se encuentra el numero y si se encuentra 
        repetido
        */
        
        int[] vector = new int [10];
        Random rand = new Random();
        
        //(int) (Math.random()*100 +1)
        for ( int i = 0; i < 10; i++ ){
            vector [i] = rand.nextInt(100);
    }
        for ( int i = 0; i < 10; i++ ){
            System.out.print(" [ " + vector[i] + " ] ");
        }
        System.out.println(" ");
        System.out.println("Ingrese el numero que quiere buscar en el vector:");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        
        int cont = 0;
        for ( int i = 0; i < 10; i++ ){
           if (vector[i] == numero){
               cont = cont + 1;
               System.out.println("El numero esta en la posicion [" + i + "]");
           }
        }
        if (cont > 0){
        System.out.println("el numero se encontro " +cont+ " veces"); 
        }else{
            System.out.println("el numero no esta en vector");
        }
    }
}
