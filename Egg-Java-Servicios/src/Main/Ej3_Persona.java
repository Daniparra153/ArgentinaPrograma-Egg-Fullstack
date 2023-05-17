/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooserviciosej3;

import Entidades.Persona;
import Servicios.PersonaServicios;

/**
 *
 * @author danip
 */
public class Ej3_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PersonaServicios n1 = new PersonaServicios();
        Persona p1 = n1.CrearPersona();
        Persona p2 = n1.CrearPersona();
        Persona p3 = n1.CrearPersona();
        Persona p4 = n1.CrearPersona();

        Persona[] Vector = new Persona[4];

        Vector[0] = p1;
        Vector[1] = p2;
        Vector[2] = p3;
        Vector[3] = p4;
        
        int auxMen = 0;
        int auxMay = 0;
        int porcAP = 0;
        int porcMP= 0;
        int porcDP = 0;
        
        for (int i = 0; i < 4; i++) {
            Persona p = Vector[i];
            if (n1.MayorDeEdad(p)) {
                System.out.println(n1.getNombre(p) + " : Es Mayor de Edad");
                auxMay = auxMay+ 1;
                
            } else {
                System.out.println(n1.getNombre(p) + " Es Menor de Edad");
                 auxMen = auxMen+ 1;
            }
            switch (n1.calcularIMC(p)) {
                case 1:
                    System.out.println(n1.getNombre(p) + " : Arriba del Peso ideal");
                    porcAP= porcAP + 1;
                    break;
                case 0:
                    System.out.println(n1.getNombre(p) + " : Peso Ideal");
                     porcMP= porcMP + 1;
                    break;
                case (-1):
                    System.out.println(n1.getNombre(p) + " : Debajo del Peso ideal");
                     porcDP= porcDP + 1;
                    break;
            }
        }
        
        System.out.println(" ");
        System.out.println(" El total de personas por encima de su peso ideal es de: " + porcAP);
        System.out.println(" El total de personas en su peso ideal es de: " + porcMP);
        System.out.println(" El total de personas por debajo de su peso ideal es de: " + porcDP);
        System.out.println(" ");
        
        System.out.println(" el porcentaje de personas mayores de edad es de : " + (100 / 4) * auxMay );
         System.out.println(" el porcentaje de personas mayores de edad es de : " + (100 / 4) * auxMen );
        
        
        
    }
}

    /*
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso
ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
Para esto, podemos crear unos métodos adicionales.

  Persona[] porcIMC = new Persona [4];
        Vector[0] = p1;
        Vector[1] = p2;
        Vector[2] = p3;
        Vector[3] = p4;
        
        Persona[] mayorMenor = new Persona [4];
        Vector[0] = p1;
        Vector[1] = p2;
        Vector[2] = p3;
        Vector[3] = p4;
 */
   