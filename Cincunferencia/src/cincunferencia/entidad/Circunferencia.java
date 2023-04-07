/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cincunferencia.entidad;

import java.util.Scanner;

/**
 **Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
 * @author BeluS
 */
public class Circunferencia {

    Scanner leer = new Scanner(System.in);

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(Circunferencia circulo) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circuferencia");
       circulo.setRadio(leer.nextInt());
    }

    public  void area(Circunferencia circulo) {
        double area = Math.PI * (Math.pow(circulo.getRadio(), 2));
        System.out.println("El área del círculo es: " + area);
    }

        public  void perimetro(Circunferencia circulo) {
        double perimetro = Math.PI * circulo.radio * 2;
        System.out.println("El área del círculo es: " + perimetro);
    }

 
}
