package main;

/**
 * @author Felipe Concha Almeida
 */

public class CadenasDeCaracteres {

    public static void main(String[] args) {
        String cadena1 = "Soy una cadena inicializada"; //Una cadena se puede inicializar.
        String cadena2;
        String cadena3;

        cadena2 = "Soy una cadena asignada"; //Una cadena se puede declarar y asignar posteriormente.

        System.out.println(cadena1 + " y " + cadena2); //Al imprimir, se pueden concatenar dos o mas cadenas utilizando el operador + .
        System.out.println("Cadena 1 es igual a cadena 2: " + (cadena1.equals(cadena2))); //cadena1.equals(cadena2) retorna true en caso de ser iguales y false en caso contrario.
        
        cadena1 = cadena2.toLowerCase(); //Una cadena se puede convertir en Mayuscula.
        cadena2 = cadena2.toUpperCase(); //Una cadena se puede convertir en Minuscula.

        cadena3 = "Hola";
        System.out.println("El largo de cadena 3 es :" + cadena3.length()); //Output: 4
    }
}