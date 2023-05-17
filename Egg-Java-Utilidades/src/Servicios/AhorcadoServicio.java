/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author danip
 */
public class AhorcadoServicio {
    private Scanner leer = new Scanner(System.in, "ISO-8859-1");

//        ● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
//        jugadas máxima. Con la palabra del usuario, pone la longitud de la
//        palabra, como la longitud del vector. Después ingresa la palabra en el
//        vector, letra por letra, quedando cada letra de la palabra en un índice
//        del vector. Y también, guarda la cantidad de jugadas máximas y el
//        valor que ingresó el usuario.
        private Ahorcado crearJuego() {
                System.out.print("Ingrese la palabra a buscar (POR FAVOR INGRESE SOLO MAYUSCULAS SIN TILDE): ");
                String palabra = leer.next(); // con esto evitamos que el usuario ingrese 2 palabras.
                System.out.print("Ingrese la cantidad de jugadas máximas: ");
                int cantJugadasMaximas = leer.nextInt();
                return new Ahorcado(palabra.toCharArray(), cantJugadasMaximas);
        }

//       ● Método longitud(): muestra la longitud de la palabra que se debe
//        encontrar. Nota: buscar como se usa el vector.length.
        private int longitud(Ahorcado juego) {
                System.out.println("Longitud de la palabra:" + juego.getPalabraBuscar().length);
                return juego.getPalabraBuscar().length;
        }

//        ● Método buscar(letra): este método recibe una letra dada por el
//        usuario y busca si la letra ingresada es parte de la palabra o no.
//        También informará si la letra estaba o no.
        // EJEMPLO : CASA -> C~S~
        private boolean buscar(Ahorcado juego, char letra) {
                char[] aux = new char[juego.getPalabraBuscar().length];

                boolean b = false;
                longitud(juego);
                for (int i = 0; i < juego.getPalabraBuscar().length; i++) {
                        aux[i] = juego.getPalabraBuscar()[i];
                        if (juego.getPalabraBuscar()[i] == letra) {
                                b = true;
                                // CantLetrasEncontradas = CantLetrasEncontradas + 1
                                juego.setCantLetrasEncontradas(juego.getCantLetrasEncontradas() + 1);
                                aux[i] = '~';
                        }
                }
                if (b) {
                        System.out.println("Mensaje: La letra pertenece a la palabra.");
                        juego.setPalabraBuscar(aux);
                } else {
                        System.out.println("Mensaje: La letra NO pertenece a la palabra.");
                }
                return b;
        }

//        ● Método encontradas(letra): que reciba una letra ingresada por el
//        usuario y muestre cuantas letras han sido encontradas y cuántas le
//        faltan. Este método además deberá devolver true si la letra estaba y
//        false si la letra no estaba, ya que, cada vez que se busque una letra
//        que no esté, se le restará uno a sus oportunidades.
        private boolean encontradas(Ahorcado juego, char letra) {
                boolean b = buscar(juego, letra);
                System.out.println("Número de letras (encontradas, faltantes): (" + juego.getCantLetrasEncontradas() + ","
                        + (juego.getPalabraBuscar().length - juego.getCantLetrasEncontradas()) + ")");
                return b;
                // return buscar(juego, letra); NO PO QUE NO RESPETA EL ORDEN DE LOS MSJS DEL EJEMPLO.
        }

//        ● Método intentos(): para mostrar cuántas oportunidades le queda al
//        jugador.  
        private void intentos(Ahorcado juego) {
                System.out.println("Número de oportunidades restantes: " + juego.getCantJugadasMaximas());
        }

//        ● Método juego(): el método juego se encargará de llamar todos los
//        métodos previamente mencionados e informará cuando el usuario
//        descubra toda la palabra o se quede sin intentos. Este método se
//        llamará en el main.
        public void juego() {
                Ahorcado juego = crearJuego();
                char letra;
                do {
                        System.out.println("Ingrese una letra:");
                        letra = leer.next().charAt(0);
                        if (!encontradas(juego, letra)) {
                                // CantJugadasMaximas = CantJugadasMaximas - 1
                                juego.setCantJugadasMaximas(juego.getCantJugadasMaximas() - 1);
                        }
                        intentos(juego);
                        System.out.println("----------------------------------------------\n");
                } while (juego.getCantJugadasMaximas() > 0 && juego.getCantLetrasEncontradas() < juego.getPalabraBuscar().length);
  
                if (juego.getCantJugadasMaximas() == 0) {
                        System.err.println("\n          ¡FALLASTE!");
                } else {
                        System.err.println("\n          ¡BIEN HECHO!");
                }
        }
}

//Un ejemplo de salida puede ser así:
//Ingrese una letra:
//a
//Longitud de la palabra: 6
//Mensaje: La letra pertenece a la palabra
//Número de letras (encontradas, faltantes): (3,4)
//Número de oportunidades restantes: 4
//--------------------------------------------

