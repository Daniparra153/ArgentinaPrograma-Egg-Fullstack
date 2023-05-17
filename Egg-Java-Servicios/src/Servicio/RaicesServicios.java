/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

 */
/**
 *
 * @author danip
 */
public class RaicesServicios {

    Scanner leer = new Scanner(System.in);

    public Raices asignarValores() {

        System.out.println("Ingrese el valor de ´a´ : ");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor de ´b´ : ");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor de ´c´ : ");
        double c = leer.nextDouble();
        System.out.println(" ");

        return new Raices(a, b, c);
    }
    //Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

    public double getDiscriminante(Raices raices) {
        double discriminante =  Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
        return discriminante;
    }
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.

    public boolean tieneRaices(Raices raices) {
        return raices.discriminante >=0;
    }

    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices raices) {
      
        return raices.discriminante ==0;
    }

    //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices)) {
            System.out.println("La posible Solucion 1 seria: " + ((-raices.getB() +  Math.sqrt(Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC())) / (2 * raices.getA())));
            System.out.println("La posible Solucion 2 seria: " + ((-raices.getB() -  Math.sqrt(Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC())) / (2 * raices.getA())));
        } else {
            System.out.println("No existen soluciones reales");
        }
    }

    public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            System.out.println("La única solución es: " + (-raices.getB() / (2 * raices.getA())));
        } else {
            System.out.println("No existe una única solución real");

        }
    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones 
    que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos
     y en caso de no existir solución, se mostrará un mensaje.
     */
     public void calcular() {
        Raices ecuacion = asignarValores();
        
        if (tieneRaices(ecuacion)) {
            obtenerRaices(ecuacion);
        } else if (tieneRaiz(ecuacion)) {
            obtenerRaiz(ecuacion);
        } else {
            System.out.println("No existen soluciones reales");
        }
    }
}

