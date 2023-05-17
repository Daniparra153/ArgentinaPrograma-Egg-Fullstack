/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author danip
 */
/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
public class CadenaServicios {
    
Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena fs) {

        int contador = 0;

        for (int i = 0; i < fs.getLongitud(); i++) {

            switch (fs.getFrase().substring(i, i + 1).toLowerCase()) {

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    contador++;
                    break;

                default:

            }

        }
        System.out.println("La frase tiene: " + contador + " vocales.");
    }

    /*
    String vocales = "aeiouAEIOU";
        int contador = 0;

        for (int i = 0; i < fs.getLongitud(); i++) {
            char actual = fs.getFrase().charAt(i);
            if (vocales.contains(String.valueOf(actual))) {
                contador++;
            }
        }
        System.out.println("la cantidad de vocales es: "+ contador );
    }
     */
    public void invertirFrase(Cadena fs) {
        String cadena2 = "";
        for (int i = fs.getLongitud() - 1; i >= 0; i--) {

            cadena2 = cadena2.concat(fs.getFrase().substring(i, i + 1));
        }
        System.out.println(cadena2);

        /*
        StringBuilder cadena2 = new StringBuilder(fs.getFrase());
        cadena2.reverse();
        String fraseInvertida = cadena2.toString();
        System.out.println("La frase invertida seria: " + fraseInvertida);
        }
         */
    }

    public void vecesRepetido(Cadena fs) {
        System.out.println("Que letra o vocal a buscar en la frase");
        String vocales = leer.next();
        int contador = 0;

        for (int i = 0; i < fs.getLongitud(); i++) {
            char actual = fs.getFrase().toLowerCase().charAt(i);
            if (vocales.contains(String.valueOf(actual))) {
                contador++;
            }
        }
        System.out.println("la cantidad de vocales es: " + contador);
    }

    public void compararLongitud(Cadena fs) {
        System.out.println("Ingrese una frase nueva");
        String frase2 = leer.next();
        if (fs.getLongitud() == frase2.length()) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else {
            System.out.println("Las dos frases tienen longitud diferente");
        }
    }

    public void unirFrase(Cadena fs) {
        System.out.println("Ingrese una frase nueva");
        String frase2 = leer.next();

        System.out.println(fs.getFrase().concat(" ").concat(frase2));
    }

    public void reemplazar(Cadena fs) {
        System.out.println("Ingrese el caracter por el que quiere cambiar la letra a");
        String letra = leer.next();
        System.out.println(fs.getFrase().toLowerCase().replaceAll("a", letra));

    }

    public boolean contiene(Cadena fs) {
        System.out.println("Que letra o vocal a buscar en la frase");
        String vocales = leer.next();
        return fs.getFrase().contains(vocales);
        
    }
}
