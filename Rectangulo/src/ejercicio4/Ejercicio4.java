/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidad.Rectangulo;

/**
 *
 * @author BeluS
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1=new Rectangulo();
       r1.crearRectangulo(r1);
       r1.calcularSuperficie(r1);
       r1.calcularPerimetro(r1);
       r1.DibujarRectangulo(r1);
      
       Rectangulo r2=new Rectangulo();
       r2.crearRectangulo(r2);
       r2.calcularSuperficie(r2);
       r2.calcularPerimetro(r2);
       r2.DibujarRectangulo(r2);
    }
    
}
