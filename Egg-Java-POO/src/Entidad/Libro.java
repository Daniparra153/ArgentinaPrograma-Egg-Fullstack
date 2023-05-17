package ENTIDAD;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para
cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el número de páginas.
*/

public class Libro {
    //atributos
    public int ISBN;
    public String Título;
    public String Autor;
    public int numPag;
    
    //constructor con parametros

    public Libro(int ISBN, String Título, String Autor, int numPag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.numPag = numPag;
    }
//constructor vacio
    public Libro() {
    }

    //metodo = función o procedimiento
      public void infLibro(){
       Scanner leer=new Scanner(System.in);
        System.out.print("Título: ");
        Título=leer.nextLine();
        System.out.print("Autor: ");
        Autor=leer.nextLine();
        System.out.print("ISBN: ");
        ISBN=leer.nextInt();
        System.out.print("Número de paginas: ");
        numPag=leer.nextInt();
      
       }

 @Override
    public String toString() {
        return " " + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", numPag=" + numPag;
    }   
}
