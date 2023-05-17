/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), 
dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
-Método para crear cuenta pidiéndole los datos al usuario.
-Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
-Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene
la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
-Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
-Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
-Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
/**
 *
 * @author danip
 */
public class CuentaBancariaServicios {

    CuentaBancaria cuenta1 = new CuentaBancaria();

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese su numero de cuenta");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su numero de DNI");
        cuenta1.setDniCliente(leer.nextInt());
        cuenta1.setSaldoActual(Math.random() * 100000 + 1);
        return new CuentaBancaria();
    }

    public double ingresar() {
        System.out.println("Su saldo actual es de: " + cuenta1.getSaldoActual());
        System.out.println("Cuanto dinero desea ingresar: ");
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + leer.nextDouble());
        return cuenta1.getSaldoActual();
    }

    public double retirar() {
        System.out.println("Su saldo actual es de: " + cuenta1.getSaldoActual());
        System.out.println("cuanto dinero desea retirar: ");
        double cantidad = leer.nextDouble();
        if (cantidad > cuenta1.getSaldoActual()) {
            cantidad = cuenta1.getSaldoActual();
        }
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() - cantidad);
        System.out.println("Se han retirado " + cantidad + " y su saldo actual es de: " + cuenta1.getSaldoActual());
        return cuenta1.getSaldoActual();
    }

    public double extraccionRapida() {

        System.out.println("Usted tiene disponible para extraccion rapida : " + (cuenta1.getSaldoActual() * 0.20));
        System.out.println("cuanto dinero desea retirar: ");
        double extraccionRapida = leer.nextDouble();
        if (extraccionRapida > (cuenta1.getSaldoActual() * 0.20)) {
            System.out.println("el monto que desea retirar no esta disponible en esta opcion");

        } else {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - extraccionRapida);
            System.out.println("Se han retirado " + extraccionRapida + " y su saldo actual es de: " + cuenta1.getSaldoActual());
            return cuenta1.getSaldoActual();
        }
return cuenta1.getSaldoActual();
    }

    public double ConsultarSaldo() {
        System.out.println("Su saldo actual es de: " + cuenta1.getSaldoActual());
        return cuenta1.getSaldoActual();
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta1.getDniCliente());
    }

}
