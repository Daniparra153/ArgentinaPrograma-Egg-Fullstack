/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza
de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina 
cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios para
adivinar el número y el número de veces que cada jugador ha ganado.
 */
/**
 *
 * @author danip
 */
public class Juego {

    public int ganados1 = 0;
    public int ganados2 = 0;
    public int intentos = 5;
    public int num1;
    public int round;
    boolean gano = false;
    
    public Juego() {
    }



    public void iniciar_juego() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.print("¿Cuántos rounds quieren jugar? ");
            round = leer.nextInt();
            
            for (int i = 0; i < round; i++) {
                System.out.print("Jugador 1, ingrese un número entre 1 y 100: ");
                num1 = leer.nextInt();
                intentos = 5;
                int veces = 0;
                
                for (int j = 0; j < 5; j++) {
                    System.out.println("Jugador 2, ingrese un número (intentos restantes: " + intentos + ")");
                    int num2 = leer.nextInt();
                    veces++;
                    if (num2 == num1) {
                        System.out.println("¡Ganaste! en " + veces + " intentos.");
                        ganados2++;
                        break;
                    } else if (num2 < num1) {
                        System.out.println("El número es mayor.");
                    } else {
                        System.out.println("El número es menor.");
                    }
                    intentos--;
                }
                if (intentos == 0) {
                    System.out.println("Perdiste.");
                    ganados1++;
                }
                System.out.println("Cantidad de veces que ganó el jugador 1: " + ganados1 + ", cantidad de veces que ganó el jugador 2: " + ganados2 + "\n");
            }
        }
    }
}

