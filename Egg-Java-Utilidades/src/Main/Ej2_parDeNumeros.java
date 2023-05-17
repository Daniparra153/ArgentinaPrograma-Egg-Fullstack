/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej2;

import Servicios.ParDeNumerosServicios;

/**
 *
 * @author Loscortes
 */
public class Ej2_parDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ParDeNumerosServicios distinto = new ParDeNumerosServicios();
        //ParDeNumeros num = distinto.mostrarValores();

        distinto.mostrarValores();
        System.out.println("-----------------");
        System.out.println(distinto.devolverMayor());
        System.out.println("-------------------");
        System.out.println("la potencia es " + distinto.calcularPotencia());
        System.out.println("--------------------------");
        System.out.println("La raiz es " + distinto.calculaRaiz());

    }

}
