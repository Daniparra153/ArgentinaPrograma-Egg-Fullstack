/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_nvo;

/**
 *
 * @author danip
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Recorrer un vector de N enteros contabilizando cuántos números son de
        1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
       int[] vector = new int [10];
        
        for ( int i = 0; i < 10; i++ ){
            vector [i] = (int) (Math.random()*99999);
    }
        for ( int i = 0; i < 10; i++ ){
            System.out.print(" [ " + vector[i] + " ] ");
        }
        System.out.println(" ");
        
        //Contar cuántos números tienen 1, 2, 3, 4 o 5 dígitos
        int[] digitos = new int[6];
        for (int i = 0; i < vector.length; i++) {
            int numDigitos = String.valueOf(vector[i]).length();
            digitos[numDigitos]++;
        }

        // Imprimir los resultados
        for (int i = 1; i < digitos.length; i++) {
            System.out.println("Hay " + digitos[i] + " números con " + i + " dígitos");
        }
    }
    
       /* int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;    
       for (int  i =0 ; i < 10; i ++){
           if( vector[i] > 0 && vector[i] < 10){
               cont1 = cont1 + 1;
           }
           if( vector[i] > 9 && vector[i] < 100){
               cont2 = cont2 + 1;
           }
           if( vector[i] > 99 && vector[i] < 1000){
               cont3 = cont3 + 1;
           }
           if( vector[i] > 999 && vector[i] < 10000){
               cont4 = cont4 + 1;
           }
           if( vector[i] > 9999 && vector[i] < 100000){
               cont5 = cont5 + 1;
           }
       }
       
        System.out.println("en el vector hay " + cont1 +" numeros con 1 digito");
        System.out.println("en el vector hay " + cont2 +" numeros con 2 digitos");
        System.out.println("en el vector hay " + cont3 +" numeros con 3 digitos");
        System.out.println("en el vector hay " + cont4 +" numeros con 4 digitos");
        System.out.println("en el vector hay " + cont5 +" numeros con 5 digitos");
    }
    
    */

}