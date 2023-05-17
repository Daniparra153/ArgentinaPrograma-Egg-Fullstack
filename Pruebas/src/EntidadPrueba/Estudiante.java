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
public class Estudiante {
        // ATRIBUTOS

        private String nombre;
        private Float nota;
        
        // CONSTRUCTORES
        public Estudiante() {
        }

        public Estudiante(String nombre, Float nota) {
                this.nombre = nombre;
                this.nota = nota;
        }

        // GETTERS y SETTERS
        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public Float getNota() {
                return nota;
        }

        public void setNota(Float nota) {
                this.nota = nota;
        }

        @Override
        public String toString() {
                return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
        }
}