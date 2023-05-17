/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEJ2.Entidades;

import java.util.Scanner;

/**
 *
 * @author danip
 */

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
public class Circunferencia {
    
        private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar radio");
        radio=leer.nextFloat();
        
    }
    public double area(){
    
        return Math.PI*Math.pow(radio, 2);
    
    }
    
    public double perimetro(){
    return 2*Math.PI*radio;
    
    }
    

    
    
}
