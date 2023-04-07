/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidad;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author BeluS
 */
public class CuentaBancaria {
    Scanner leer=new Scanner(System.in);
    
    //atributos
    private String nombre;
    private int numeroCuenta;
    private long DNI;
    double SaldoActual;
    double interes;
    
    // constructor

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre,int numeroCuenta, long DNI, double SaldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
        
    }

   //setter getter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //getter
    public long getDNI() {
        return DNI;
    }
    
    public double getSaldoActual() {
        return SaldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getombre(){
        return nombre;
    }
    
    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    
    public void CrearCuenta(){

        System.out.println("Ingrese el Nombre del Cliente ");
         String Nombre=leer.next();

         this.nombre=Nombre;
         System.out.println("Ingrese el numero de cuenta dado ->");
         int cuenta=leer.nextInt();
         this.numeroCuenta=cuenta;
         System.out.println("Ingrese su DNI ->");
         long dni=leer.nextLong();
         this.DNI=dni;
         System.out.println("Ingrese el saldo en cuenta  ->");
         double saldo=leer.nextDouble();
         this.SaldoActual=saldo;
       
           CuentaBancaria cliente=new CuentaBancaria( Nombre, cuenta,  dni, saldo);
         System.out.println("La cuenta ha sido creada con éxito.");
        
          // Método ingresar(double ingreso): el método recibe una cantidad de dinero  ingresar y se la sumara a saldo actual. 
    }
    public void Depositar( CuentaBancaria cliente){
        double Saldoactual=cliente.getSaldoActual();
       
          System.out.println("Digite el dinero a depositar  -> $ ");
                    double deposito = leer.nextDouble();
                    
        double Saldo= Saldoactual+deposito;
        
        System.out.println("El saldo en cuenta es ->" +Saldo);
        
         cliente.setSaldoActual(Saldo);
        
    }
     public void Retirar(CuentaBancaria cliente){
            double Salarioactual=cliente.getSaldoActual();
         System.out.println("Digite el dinero a Retirar   -> $ ");
                      double retirar=leer.nextDouble();
           
           
         if (retirar <=Salarioactual){
              double Saldo= Salarioactual-retirar;
                  cliente.setSaldoActual(Saldo);
             System.out.println("El saldo en cuenta es -> $ " +cliente.getSaldoActual() );
           
         }else{
          System.out.println("Saldo insuficiente imposible retirar");
          double Saldo=0;
           System.out.println("El saldo en cuenta es -> $ " +Saldo );
         }
     
     }
        public void ExtraccionRapida(CuentaBancaria cliente){
            double Saldoactual=cliente.getSaldoActual();       
             System.out.println("Digite el dinero a Retirar   -> $ ");
                      double retiro=leer.nextDouble();
                     
            if(retiro<=(Saldoactual*0.20)){
                      double Saldo= Saldoactual-retiro;
                        cliente.setSaldoActual(Saldo);    
                        
                         System.out.println("El saldo en cuenta es -> $ " +cliente.getSaldoActual() );
           
        }else {
              System.out.println("El monto de retiro supera el 20% del Saldo en cuenta ");
                
           
                  System.out.println ("El saldo en cuenta es -> $ " +cliente.getSaldoActual() );
       
            }
            
            
        }
        
 //  Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.  
        public void Saldo(CuentaBancaria cliente){
            System.out.println("El saldo en cuenta es "+cliente.getSaldoActual());
            
            
        }
        
       //  Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
        public void MostrarDatos(CuentaBancaria cliente){
            System.out.println("Nombre del Cliente -> " +cliente.nombre);
            System.out.println("Numero de Cuenta -> "+ cliente.numeroCuenta);
            System.out.println("Numero de Dni -> "+ cliente.DNI);
            System.out.println("Saldo en Cuenta -> "+ cliente.SaldoActual);
            
        }
}

    
  