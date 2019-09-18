package main;

/**
 * @author Felipe Concha Almeida
 */

public class CadenasDeCaracteres {

    public static void main(String[] args) {
        String cadena1 = "Soy una cadena inicializada "; //Una cadena se puede inicializar.
        String cadena2;
        String cadena3;

        cadena2 = "Soy una cadena asignada"; //Una cadena se puede declarar y asignar posteriormente.

        System.out.println(cadena1 + cadena2); //Al imprimir, se pueden concatenar dos o mas cadenas utilizando el operador + .
       
        System.out.println("\nCadena1 = " + cadena1);
        System.out.println("Cadena2 = " + cadena2);
        System.out.println("Cadena1 es igual a cadena2: " + (cadena1.equals(cadena2))); //cadena1.equals(cadena2) retorna true en caso de ser iguales y false en caso contrario.
        
        cadena1 = cadena1.toLowerCase(); //Una cadena se puede convertir en Minuscula.
        System.out.println("\nCadena1 en minuscula: "+ cadena1);
        
        cadena2 = cadena2.toUpperCase(); //Una cadena se puede convertir en Mayuscula.
        System.out.println("Cadena2 en mayuscula: " + cadena2);

        cadena3 = "Hola";
        System.out.println("\nCadena3 = " + cadena3);
        System.out.println("El largo de cadena 3 es: " + cadena3.length()); //Output: 4
    }
}