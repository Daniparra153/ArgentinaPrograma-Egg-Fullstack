/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPruebas;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author danip
 */
public class EstudianteMain_IntegradorJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leerStr = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
                Scanner leerFlo = new Scanner(System.in);
//                Objeto nombreVector[] = new Objeto[];
                Estudiante estudiantes[] = new Estudiante[3];
                // guardar los estudiantes en un arreglo de objetos tipo Estudiante

                for (int i = 0; i < estudiantes.length; i++) {
                        System.out.print("Ingrese el nombre del " + (i + 1) + "° estudiante: ");
                        String nombre = leerStr.nextLine();
//                        estudiantes[i].setNombre(leerStr.nextLine()); NO USAR
                        System.out.print("Ingrese su nota fina: ");
                        Float nota = leerFlo.nextFloat();
//                        estudiantes[i].setNota(leerFlo.nextFloat());  NO USAR
                        estudiantes[i] = new Estudiante(nombre, nota);  // FUNCIONA => FORMA CORRECTA
                        System.out.println("");
                }

//                for (int i = 0; i < estudiantes.length; i++) {
//                        System.out.println(estudiantes[i].toString());
//                }
                // 1. Calcular y mostrar el promedio de notas de todo el curso
                float acumulador = 0;
                for (int i = 0; i < estudiantes.length; i++) {
                        acumulador = acumulador + estudiantes[i].getNota();
                }
                float promedio = acumulador / estudiantes.length;
                promedio = Math.round(promedio * 100.0f) / 100.0f; // realizar operaciones entre número del mismo tipo
                System.out.println("El promedio de las notas finales es: " + promedio);

                // 2. Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
                int contador = 0;
                for (int i = 0; i < estudiantes.length; i++) {
                        if (estudiantes[i].getNota() > promedio) {
                                contador++;
                        }
                }
                String alumnosConNotaMayor[] = new String[contador];
                int j = 0;
                for (int i = 0; i < estudiantes.length; i++) {
                        if (estudiantes[i].getNota() > promedio) {
                                alumnosConNotaMayor[j] = estudiantes[i].getNombre();
                                j++;
                        }
                }
                System.out.println("");
                
                // 3. Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
                for (int i = 0; i < alumnosConNotaMayor.length; i++) {
                        System.out.println("El " + (i + 1) + "° alumno con una nota mayor al promedio es: " + alumnosConNotaMayor[i]);
                }
        }
}