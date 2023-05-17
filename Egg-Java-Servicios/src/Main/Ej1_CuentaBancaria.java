/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;

/**
 *
 * @author danip
 */
public class Ej1_CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CuentaBancariaServicios c1 = new CuentaBancariaServicios();
        CuentaBancariaServicios c2 = new CuentaBancariaServicios();
        
        c1.crearCuenta();
        c1.ingresar();
        c1.retirar();
        c1.extraccionRapida();
        c1.ConsultarSaldo();
        c1.consultarDatos();

        c2.crearCuenta();
        c2.ingresar();
        c2.retirar();
        c2.extraccionRapida();
        c2.ConsultarSaldo();
        c2.consultarDatos();

        /*
         Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio Persona1 = new CuentaBancariaServicio();
        System.out.println("Bienvenido a Banco la Nacion");
        System.out.println("Porfavor cree su cuenta bancaria");
        CuentaBancaria Cuenta1 = Persona1.CrearCuenta();
        System.out.println(
                "OPCION 1 = Ingresar dinero \n"
                + "OPCION 2 = Retirar dinero \n"
                + "OPCION 3 = Retirar dinero Entra rapido \n"
                + "OPCION 4 = Consultar saldo \n"
                + "OPCION 5 = Consultar datos  \n"
                + "OPCION 6 = Salir");
        int var;
        do {
            System.out.println("Ingrese una opcion : ");
            var = leer.nextInt();
            switch (var) {
                case 1:
                    Persona1.ingresar(Cuenta1);
                    break;
                case 2:
                    Persona1.retirar(Cuenta1);
                    break;
                case 3:
                    Persona1.ExtraccionRapida(Cuenta1);
                    break;
                case 4:
                    Persona1.ConsultarSlado(Cuenta1);
                    break;
                case 5:
                    Persona1.ConsultarDatos(Cuenta1);
                    break;
                case 6:
                    System.out.println("Adios... vuelva pronto.");
            }
        } while (var != 6);
    }
}
         */
    }

}
