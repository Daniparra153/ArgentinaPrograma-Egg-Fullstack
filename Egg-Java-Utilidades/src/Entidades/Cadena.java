/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author danip
 */
/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo 
debe setear la longitud de la frase de manera automática.
*/
public class Cadena {
    
    private String Frase;
    private int longitud;

    public Cadena() {
      
    }

    public Cadena(String Frase) {
        this.Frase = Frase;
        longitud = Frase.length();
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
        this.longitud = Frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
       // this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "Frase=" + Frase + ", longitud=" + longitud + '}';
    }
    
    
    
}
