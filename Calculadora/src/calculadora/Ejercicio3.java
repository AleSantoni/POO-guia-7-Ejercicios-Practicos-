
package calculadora;

import calculadora.entidad.Operacion;


public class Ejercicio3 {

   
    public static void main(String[] args) {
      Operacion operacion1 = new Operacion();
     
      

       operacion1.crearOperacion(operacion1);
        operacion1.sumar(operacion1);
        operacion1.restar(operacion1);
        operacion1.multiplicar(operacion1);
        operacion1.dividir(operacion1);
    
    }
    
}
