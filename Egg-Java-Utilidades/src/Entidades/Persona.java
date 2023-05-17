/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author danip
 */
/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
constructor vacío, constructor parametrizado, get y set.
*/
public class Persona {
    
  
    private String Nombre;
    private Date FechaN;

    public Persona() {
    }

    public Persona(String Nombre, Date FechaN) {
        this.Nombre = Nombre;
        this.FechaN = FechaN;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaN() {
        return FechaN;
    }

    public void setFechaN(Date FechaN) {
        this.FechaN = FechaN;
    }
    
}

