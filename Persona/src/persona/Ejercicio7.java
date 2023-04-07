
package persona;

import persona.entidad.Persona;

/**
 * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de tipo
 * Persona con distintos valores, a continuación, llamaremos todos los métodos
 * para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad. Por último, guardaremos los resultados de los
 * métodos calcularIMC y esMayorDeEdad en distintas variables, para después en
 * el main, calcular un porcentaje de esas 4 personas cuantas están por debajo
 * de su peso, cuantas en su peso ideal y cuantos, por encima, y también
 * calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 *
 * @author BeluS
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadpersonas = 4;
        Persona persona = new Persona();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        int bajo = 0;
        int ideal = 0;
        int alto = 0;

        double cantmayor = 0;
        double cantmenor = 0;

        int IMC;
        boolean mayor;
        for (int i = 0; i < cantidadpersonas; i++) {
            if (i == 0) {

                persona.crearPersona(persona);
                persona.calcularIMC(persona);
                IMC = persona.calcularIMC(persona);

                mayor = persona.esMayorDeEdad(persona);
            } else if (i == 1) {

                persona1.crearPersona(persona1);
                persona1.calcularIMC(persona1);
                IMC = persona1.calcularIMC(persona1);

                mayor = persona.esMayorDeEdad(persona1);

            } else if (i == 2) {
                persona2.crearPersona(persona2);
                persona2.calcularIMC(persona2);
                IMC = persona2.calcularIMC(persona2);

                mayor = persona2.esMayorDeEdad(persona2);

            } else {
                persona3.crearPersona(persona3);
                persona3.calcularIMC(persona3);
                IMC = persona3.calcularIMC(persona3);
                mayor = persona3.esMayorDeEdad(persona3);

            }

            switch (IMC) {
                case -1:
                    System.out.println("La persona esta por debajo de su peso ideal");
                    bajo++;
                    break;
                case 0:
                    System.out.println("La Persona tiene peso ideal");
                    ideal++;
                    break;
                default:
                    System.out.println("La persona tiene sobrepeso");
                    alto++;
                    break;

            }
            if (mayor == true) {

                System.out.println("La persona es Mayor de edad");
                cantmayor++;
            } else {
                System.out.println("La persona es menor de edad");
                cantmenor++;
            }
            System.out.println("*****************************************");
        }
        System.out.println("La cantidad de personas por debaj de su peso es : " + bajo);
        System.out.println("La cantidad de personas con peso ideal: " + ideal);
        System.out.println("La cantidad de personas con sobrepeso  : " + alto);

        System.out.println("La cantidad de personas pmayores de edad: " + (cantmayor / cantidadpersonas) * 100 + " %");
        System.out.println("La cantidad de personas menores de edad : " + (cantmenor / cantidadpersonas) * 100 + " %");

    }
}
