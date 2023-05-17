/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.ParDeNumeros;

/**
 *
 * @author Loscortes
 */
public class ParDeNumerosServicios {

ParDeNumeros c1 = new ParDeNumeros();



public void mostrarValores(){
System.out.println("Los numeros son: " + c1.getNum1() + " y " + c1.getNum2());
    
}
public double devolverMayor(){
if (c1.getNum1()>c1.getNum2()){
    return c1.getNum1();
    } else if (c1.getNum1() < c1.getNum2()){ 
    return c1.getNum2();
    } else { 
    System.out.println("Son iguales");
    return c1.getNum1();
}
}
public double calcularPotencia(){
double n1 = Math.round(c1.getNum1());
double n2 = Math.round(c1.getNum2());
if (n1 > n2){
    return Math.pow(n1,n2);
    }  else { 
    return Math.pow(n2, n1);

}
}
public double calculaRaiz(){
double n1 = Math.round(c1.getNum1());
double n2 = Math.round(c1.getNum2());
if (n1 > n2){
    return Math.sqrt(n2);
    }  else { 
    return Math.sqrt(n1);    
}
}
}