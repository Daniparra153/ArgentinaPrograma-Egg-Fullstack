/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author danip
 */

/*
 Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
*/
public class personaServicios {
    Scanner leer = new Scanner(System.in);
    Date date = new Date();
    Persona p1 = new Persona();
    //Método crearPersona que pida al usuario Nombre y 
    //fecha de nacimiento de la persona a crear. Retornar el objeto 
    //Persona creado.

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre: ");
        String Nombre = leer.nextLine();
        System.out.println("Ingrese el dia de nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento:");
        int anio = leer.nextInt();
        Date FechaN = new Date(anio - 1900, mes -1, dia);
        p1.setFechaN(FechaN);
        p1.setNombre(Nombre);
        return p1;
    }
    //Método calcularEdad que calcule la edad del usuario utilizando
    //el atributo de fecha de nacimiento y la fecha actual.

    public int calcularEdad() {
        Date fechaActual = new Date();
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L; // milisegundos por año
        long diferenciaEnMilisegundos = fechaActual.getTime() - p1.getFechaN().getTime();
        int diferenciaEnAnios = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);
        
       return diferenciaEnAnios;
    }
//Método menorQue recibe como parámetro una Persona y una edad. 
//Retorna true si la persona es menor que la edad consultada o false en 
//caso contrario.
 public boolean menorQue(Persona p1){
     System.out.println("Ingrese una edad para comparar: ");
     int edad = leer.nextInt();
     boolean dif = (calcularEdad()<edad); 
     System.out.println(dif);
    return dif;
}
//Método mostrarPersona que muestra la información de la persona deseada.
 public void mostrarPersona(Persona p1){
     System.out.println("La persona se llama: " + p1.getNombre());
     System.out.println("Fecha de Nacimiento: " + p1.getFechaN());
     //System.out.println("Edad:" + calcularEdad(p1));
 }
}

