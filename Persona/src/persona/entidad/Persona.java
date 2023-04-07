
package persona.entidad;

import java.util.Scanner;

/**
 *Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

 * 
 */
public class Persona {
    Scanner leer =new Scanner(System.in);
    //Atributos
    private String nombre;
    private int edad;
    private String Sexo;
    private double peso;
    private double altura;
    //constructores 

    public Persona() {
    }

    public Persona(String nombre, int edad, String Sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.Sexo = Sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //getter

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    /*
    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
    */
  
    public void crearPersona(Persona persona){
        
        System.out.println("Digite el nombre de la persona ->");
        this.nombre=leer.next();
        System.out.println("Digite la edad ->");
        this.edad=leer.nextInt();
        boolean verificador =false;
        do {
             System.out.println("Digite el sexo H para hombre/ M para mujer / O para otro genero");
             String opcion=leer.next();
             if(opcion.equalsIgnoreCase("H")||opcion.equalsIgnoreCase("M")|| opcion.equalsIgnoreCase("O")){
             this.Sexo=opcion;
              verificador=true;
             } else{
                 System.out.println("Caracter ingresado incorrecto");
             }
        } while (!verificador);
        
            System.out.println("Digite el peso->");
            this.peso=leer.nextDouble();
        
         System.out.println("Digite la altura->");
            this.altura=leer.nextDouble();
      /*

            */  
        
    }
/*
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
    */
    public int calcularIMC(Persona persona) {
        int cont=0;

    double  IMC=persona.getPeso()/ Math.pow(persona.getAltura(), 2);
    
  
        if (IMC < 20) {
            cont++;
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            cont++;
            return 0;

        } else 
            cont++;
            return 1;
        }

    

    // Método esMayorDeEdad(): indica si la persona es mayor de edad. La funció devuelve un booleano.
    public boolean esMayorDeEdad(Persona persona) {

        if (persona.getEdad() >= 18) {
            return true;

        } else {
            return false;
        }

    }

}
