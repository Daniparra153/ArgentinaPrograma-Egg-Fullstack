/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Cadena;
import Servicios.CadenaServicios;



/**
 *
 * @author danip
 */
public class Ej1_Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadenaServicios f1 = new CadenaServicios();

        Cadena c1 = new Cadena("Aguante el otoño");

        f1.mostrarVocales(c1);
        f1.invertirFrase(c1);
        f1.vecesRepetido(c1);
        f1.compararLongitud(c1);
        f1.unirFrase(c1);
        f1.reemplazar(c1);
        System.out.println(f1.contiene(c1));
    }

}

