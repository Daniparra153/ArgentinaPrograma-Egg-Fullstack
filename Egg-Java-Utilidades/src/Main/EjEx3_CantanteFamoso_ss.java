/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danip
 */
public class EjEx3_CantanteFamoso_ss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leerStr = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
                Scanner leerInt = new Scanner(System.in);
                Scanner leerchar = new Scanner(System.in);
                ArrayList<CantanteFamoso> listaCantanteFamoso = new ArrayList();

                // agregar 5 objetos de tipo CantanteFamoso a la lista
                System.out.println("Ingrese los 5 primeos artistas de la lista");
                for (int i = 0; i < 5; i++) {
                        CantanteFamoso cantantefamoso = new CantanteFamoso();
                        System.out.print("Ingrese el nombre del " + (i + 1) + "° cantante famoso: ");
                        cantantefamoso.setNombre(leerStr.nextLine());
                        System.out.print("Ingrese su disco con más ventas: ");
                        cantantefamoso.setDiscoConMasVentas(leerStr.nextLine());
                        listaCantanteFamoso.add(cantantefamoso);
                }

                // Luego, se debe mostrarlos
                for (int i = 0; i < 5; i++) {
                        System.out.println("\nEl " + (i + 1) + "° cantante famoso es: " + listaCantanteFamoso.get(i).getNombre()
                                + "\nY su disco con más ventas es: " + listaCantanteFamoso.get(i).getDiscoConMasVentas());
                }

                // crear un menú
                
                char opc;
                int indice;
                ArrayList<CantanteFamoso> listaDeAgregados = new ArrayList();
                ArrayList<CantanteFamoso> listaDeBorrados = new ArrayList();
                do {
                        System.out.println("==================================");
                        System.out.println("            MENU DE OPCIONES");
                        System.out.println("1)_agregar un cantante más");
                        System.out.println("2)_mostrar todos los cantantes");
                        System.out.println("3)_eliminar un cantante a elegir");
                        System.out.println("4)_ Salir");
                        System.out.print("                                            Elija su opción: ");
                        opc = leerchar.next().charAt(0);
                        switch (opc) {
                                case '1':
                                        CantanteFamoso cantantefamoso = new CantanteFamoso();
                                        System.out.print("Ingrese el nombre del nuevo cantante famoso: ");
                                        cantantefamoso.setNombre(leerStr.nextLine());
                                        System.out.print("Ingrese su disco con más ventas: ");
                                        cantantefamoso.setDiscoConMasVentas(leerStr.nextLine());
                                        listaCantanteFamoso.add(cantantefamoso);
                                        listaDeAgregados.add(cantantefamoso);
                                        break;
                                case '2':
                                        for (int i = 0; i < listaCantanteFamoso.size(); i++) {
                                                System.out.println("\nEl " + (i + 1) + "° cantante famoso es: " + listaCantanteFamoso.get(i).getNombre()
                                                        + "\nY su disco con más ventas es: " + listaCantanteFamoso.get(i).getDiscoConMasVentas());
                                        }
                                        break;
                                case '3':
                                        // Buscar el objeto en el array
                                        // indice = listaCantanteFamoso.indexOf(objecantantefamosotoABorrar);
                                        System.out.print("Ingrese el índice del cantante famoso a borrar: ");
                                        indice = leerInt.nextInt() - 1;
                                        // Borrar el objeto del array
                                        if (indice < listaCantanteFamoso.size()) {
                                                listaDeBorrados.add(listaCantanteFamoso.get(indice));
                                                listaCantanteFamoso.remove(indice);
                                        }else{
                                                System.err.println("                    INDICE INVALIDO!!!");
                                        }
                                        break;
                                case '4':
                                        System.out.println("Gracias por usar nuestro programa...");
                                        break;
                                default:
                                        System.err.println("            OPCION INCORRECTA!!!");
                        }
                } while (opc != '4');

                // mostrar la lista con todos los cambios.
                System.out.println("\nEste es el listado de cambios realizados por el usuario.");
                if (listaDeAgregados.isEmpty()) {
                        System.out.println("\nEl usuario no agregó ningún nuevo cantante famoso a la lista.");
                } else {
                        System.out.println("\nCantantes Famosos agregados a la lista");
                        for (int i = 0; i < listaDeAgregados.size(); i++) {
                                System.out.println("\nEl " + (i + 1) + "° cantante famoso agregado es: " + listaDeAgregados.get(i).getNombre()
                                        + "\nY su disco con más ventas es: " + listaDeAgregados.get(i).getDiscoConMasVentas());
                        }
                }
                if (listaDeBorrados.isEmpty()) {
                        System.out.println("\nEl usuario no borró ningún cantante famoso de la lista.");
                } else {
                        System.out.println("\nCantantes Famosos borrados de la lista");
                        for (int i = 0; i < listaDeBorrados.size(); i++) {
                                System.out.println("\nEl " + (i + 1) + "° cantante famoso borrado fue: " + listaDeBorrados.get(i).getNombre()
                                        + "\nY su disco con más ventas era: " + listaDeBorrados.get(i).getDiscoConMasVentas());
                        }
                }
        }

}
