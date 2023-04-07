
package libro;


import libro.entidad.Libro;

/**
 *
 *  Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Libro primerLibro = new Libro(1254, "El principito", "Ale", 100);
         primerLibro.mostrarLibro(primerLibro);
        System.out.println("***************************");
    
        
        
        Libro segundoLibro = new Libro();

        segundoLibro.cargarLibro(segundoLibro);
        segundoLibro.mostrarLibro(segundoLibro);
      
    }
}