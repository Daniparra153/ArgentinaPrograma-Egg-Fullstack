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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][] matriz = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese los numeros para la matriz (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i+1) + ", Columna " + (j+1) + ": ");
                matriz[i][j] = input.nextInt();
            }
        }
        
        // Verificar si es una matriz antisimetrica
        boolean esAntisimetrica = true;
        
        // Comparar la matriz con su propia traspuesta, cambiada de signo
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }
        
        // Mostrar resultado
        if (esAntisimetrica) {
            System.out.println("¡Es una matriz antisimetrica!");
        } else {
            System.out.println("No es una matriz antisimetrica.");
        }
    }
}