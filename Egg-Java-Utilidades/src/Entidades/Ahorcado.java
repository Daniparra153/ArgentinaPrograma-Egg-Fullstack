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
public class Ahorcado {
    
        // ATRIBUTOS
        private char[] palabraBuscar;
        private Integer cantLetrasEncontradas;
        private Integer cantJugadasMaximas;
        
        // Constructores

        public Ahorcado() {
        }

        public Ahorcado(char[] palabraBuscar, /*Integer cantLetrasEncontradas,*/ Integer cantJugadasMaximas) {
                this.palabraBuscar = palabraBuscar;
                this.cantLetrasEncontradas = 0;
                this.cantJugadasMaximas = cantJugadasMaximas;
        }
        
        // Getters y Setters

        public char[] getPalabraBuscar() {
                return palabraBuscar;
        }

        public void setPalabraBuscar(char[] palabraBuscar) {
                this.palabraBuscar = palabraBuscar;
        }

        public Integer getCantLetrasEncontradas() {
                return cantLetrasEncontradas;
        }

        public void setCantLetrasEncontradas(Integer cantLetrasEncontradas) {
                this.cantLetrasEncontradas = cantLetrasEncontradas;
        }

        public Integer getCantJugadasMaximas() {
                return cantJugadasMaximas;
        }

        public void setCantJugadasMaximas(Integer cantJugadasMaximas) {
                this.cantJugadasMaximas = cantJugadasMaximas;
        }

        @Override
        public String toString() {
                return "Ahorcado{" + "palabraBuscar=" + palabraBuscar + ", cantLetrasEncontradas=" + cantLetrasEncontradas + ", cantJugadasMaximas=" + cantJugadasMaximas + '}';
        }
        
 }

