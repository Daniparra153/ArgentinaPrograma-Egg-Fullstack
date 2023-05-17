/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author danip
 */
public class PersonaServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public boolean MayorDeEdad(Persona n) {
        return (n.getEdad() >= 18);
      
    }
    
public String getNombre(Persona n){
        return n.getNombre();
    }
    
    
    
    public Persona CrearPersona() {
        System.out.println(" Ingrese Nombre");
        String nombre = leer.next();
        System.out.println(" Ingrese Edad");
        int edad = leer.nextInt();
        System.out.println(" Ingrese Sexo");
        String sexo = leer.next().toLowerCase();
        while (!sexo.equals("m") && !sexo.equals("h") && !sexo.equals("o")){
            System.out.println("  No tomamos sexo binarios");
            System.out.println(" Ingrese Nuevamente el Sexo");
            sexo = leer.next().toLowerCase();
        }

        System.out.println(" Ingrese Peso");
        int peso = leer.nextInt();
        System.out.println(" Ingrese Altura");
       double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona n) {
        int peso = n.getPeso();
        double altura = n.getAltura();

        double imc = peso / Math.pow(altura, 2);
        int resultadoImc;
        if (imc < 20) {
            resultadoImc = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultadoImc = 0;
        } else {
            resultadoImc = 1;
        }
        return resultadoImc;

    }
}




   