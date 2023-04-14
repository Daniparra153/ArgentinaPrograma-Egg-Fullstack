/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_nvo;

import java.util.Scanner;

/**
 *
 * @author danip
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] cuadrado = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese los numeros para el cuadrado magico (1-9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num;
                do {
                    System.out.print("Fila " + (i+1) + ", Columna " + (j+1) + ": ");
                    num = input.nextInt();
                } while (num < 1 || num > 9);
                cuadrado[i][j] = num;
            }
        }
        
        // Verificar si es un cuadrado magico
        int sum = 0;
        boolean esMagico = true;
        
        // Suma de la primera fila
        for (int j = 0; j < 3; j++) {
            sum += cuadrado[0][j];
        }
        
        // Verificar que cada fila sume lo mismo
        for (int i = 1; i < 3; i++) {
            int filaSum = 0;
            for (int j = 0; j < 3; j++) {
                filaSum += cuadrado[i][j];
            }
            if (filaSum != sum) {
                esMagico = false;
                break;
            }
        }
        
        // Verificar que cada columna sume lo mismo
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += cuadrado[i][j];
            }
            if (colSum != sum) {
                esMagico = false;
                break;
            }
        }
        
        // Suma de la diagonal principal
        int diagSum = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        if (diagSum != sum) {
            esMagico = false;
        }
        
        // Suma de la diagonal secundaria
        diagSum = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        if (diagSum != sum) {
            esMagico = false;
        }
        
        // Mostrar resultado
        if (esMagico) {
            System.out.println("¡Es un cuadrado magico!");
        } else {
            System.out.println("No es un cuadrado magico.");
        }
    }
}