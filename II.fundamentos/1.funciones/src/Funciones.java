/**
 *
 * @author Felipe Concha Almeida
 */

public class Funciones {

    public static void main(String[] args) {
        System.out.println("El factorial de 4 es :" +factorial(4));
    }

    //En la parte superior de la funcion tenemos comentarios interpretados por el JavaDoc, 
    //esto genera documentacion automatica de todo nuestro proyecto en formato HTML.

    /**
     * Función que calcula el factorial de un numero.
     * 
     * @param numeroEntero  Numero entero del cual se desea calcular el factorial.
     *
     * @return Factorial calculado.
     * 
     * @version 1.0
     */
    private static int factorial(int numeroEntero) {  //La palabra reservada private, indica que esta funcion solo puede ser
        int factorial;                                //utilizada dentro de esta clase, en este caso como es la clase principal 
                                                      //tambien debemos agregar la palabra reservada static. 
        factorial = 1;  

        for(int i = 1;  i <= numero;  i++){
            factorial *= i;
        }

        return factorial;
    }
}