/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero"
que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo
después de realizar una transacción de retiro.
 */
/**
 *
 * @author danip
 */
public class Cuenta {

    public double saldo = Math.random() * 100000 + 1;
    public double retirar;
    public String titular;
    public boolean continuar = true;
    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void crearTitular() {
        System.out.println("Ingrese su usuario :");
        titular = leer.nextLine();
    }

    public void retirarDinero() {

        while (saldo > 0 && continuar) {
            System.out.println("Sr(a) " + titular + ", su saldo es: " + saldo);
            System.out.println("cuanto dinero desea retirar?  ");
            retirar = leer.nextDouble();

            if (retirar > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                saldo = saldo - retirar;
                System.out.println("Su saldo es ahora de: " + saldo);
            }
            System.out.println("¿Desea continuar? (s/n)");
            String respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }
}
