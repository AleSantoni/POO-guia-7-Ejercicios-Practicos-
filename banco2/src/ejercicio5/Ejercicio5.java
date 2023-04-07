
package ejercicio5;

import ejercicio5.entidad.CuentaBancaria;
import java.util.Scanner;


public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria cliente = new CuentaBancaria();

        int op;
        cliente.CrearCuenta();

        do {
            System.out.println("**********BIENVENIDOS RED  BANCO ELITE**********");
            System.out.println("1.  Depositar->");
            System.out.println("2. Retirar ->");
            System.out.println("3. Extraccion Rapida->");
            System.out.println("4. Consultar Saldo ->");
            System.out.println("5. Mostar Cuenta ->");
            System.out.println("6.  Salir ->");
            System.out.println("Digite la operacion a realizar ->");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    cliente.Depositar(cliente);
                    break;
                case 2:
                    cliente.Retirar(cliente);
                    break;
                case 3:
                    cliente.ExtraccionRapida(cliente);
                    break;
                case 4:
                    cliente.Saldo(cliente);
                    break;
                case 5:
                    cliente.MostrarDatos(cliente);
                    break;
                case 6:
                    System.out.println("Gracias por operar con BANCO ELITE ");
                    break;
                default:
                    System.out.println("Opcion ingresada Incorrecta");
                }
        } while (op != 6);
    }

}
