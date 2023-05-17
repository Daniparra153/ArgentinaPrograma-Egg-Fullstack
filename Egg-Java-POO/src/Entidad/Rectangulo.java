/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4.Entidades;

import java.util.Scanner;

/**
 *
 * @author danip
 */

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá
un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, 
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además 
definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {

    private int base;
    private int altura;

    // constructores
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void crearRectangulo() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base:");
        base = leer.nextInt();
        System.out.println("Ingrese la altura:");
        altura = leer.nextInt();

    }

    // get y set
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // metodos
    public int superficie() {

        return (base * altura);

    }

    public int perimetro() {

        return ((base * 2) + (altura * 2));

    }

    // metodo dibujar segun parametros con *
    public void dibujo() {

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {

                if (i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
