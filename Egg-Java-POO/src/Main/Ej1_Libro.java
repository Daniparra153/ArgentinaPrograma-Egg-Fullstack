
import ENTIDAD.Libro;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danip
 */
public class Ej1_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro [] libreria = new Libro [3];
        for (int i = 0; i < 3; i++) {
            System.out.println(" completa el libro: " + (i+1));
            libreria [i] = new Libro();
            libreria [i].infLibro();
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(" Libro " + (i+1) +" "+ libreria[i]);
        }
       /*  Libro l2=new Libro();
      
        l2.infLibro();
        System.out.println (l2.toString());
        */
        
    }
    
}
