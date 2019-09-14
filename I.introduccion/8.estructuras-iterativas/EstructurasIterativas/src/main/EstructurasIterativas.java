package main;

import java.util.ArrayList;

/**
 * @author Felipe Concha Almeida
 */

public class EstructurasIterativas {

    public static void main(String[] args) {
        int[] listaEnteros = {4, 5, 1, 3, 9, 2};
        boolean[] listaBoleanos = {false, true, false};
        int j;

    // For
     /* Estructura iterativa For
        Se utiliza cuando se conoce el numero de veces que se desea iterar un
        bloque de instrucciones.
     */ 
        System.out.println("For:");

        for(int i = 1;  i < listaEnteros.length; i++) {
            System.out.println( "Elemento "+ (i+1) + " = " +listaEnteros[i] );
        }

    // While
     /* Estructura iterativa While
        Se utiliza cuando se desconoce el numero de iteraciones y se desea
        validar la condicion antes de ejecutar las instrucciones.
     */
        System.out.println("\nWhile:");

        j = 0;
        while(listaBoleanos[j] != false){
            System.out.println( listaBoleanos[j]);
            j++;
        }

    // Do while
     /* Estructura iterativa Do While
        Se utiliza cuando se desconoce el numero de iteraciones y se desea
        validar la condicion despues de ejecutar las instrucciones.
     */
        System.out.println("\nDo while:");

        j = 0;
        do {
            System.out.println( listaBoleanos[j]);
            j++;
        }
        while(listaBoleanos[j] != false);

    //  ForOf
     /* Estructura iterativa ForOf
        Se utiliza para recorrer colecciones como ArrayList, itera hasta recorrer por completo la coleccion.
     */
        ArrayList<String> comandosLinux = new ArrayList<>();

        comandosLinux.add("POPD");
        comandosLinux.add("CD");
        comandosLinux.add("CAT");
        comandosLinux.add("LS");
        comandosLinux.add("toUCH");
        comandosLinux.add("PUSHd");

        for(int index = 0;  i < comandosLinux.size();  index++) { //Recorremos usando un For tradicional.
            String comando;
            String comandoMinuscula;

            comando = comandosLinux.get(index); //Obtenemos el comando de la coleccion.
            comandoMinuscula = comando.toLowerCase(); //Lo pasamos a minuscula.
            comandosLinux.add(index, comandoMinuscula); //Reemplazamos el comando por el comando en minuscula.
        }

      //int index = 0;  //ForOf
      //for (String comando : comandosLinux) {  //Esto es equivalente al recorrido anterior con For tradicional, pero utilizando el ForOf.
      //    comandosLinux.add(index++, comando.toLowerCase());  //Como el ++ es sufijo, guarda el comando en minuscula y despues aumenta index.
      //}

        for (String comando : comandosLinux) { //Recorrimos nuevamente la coleccion, pero esta vez para mostrar todo su contenido utilizando el ForOf.
            System.in.println(comando);
        }

    //[BONUS] ForEach 
    
     /* Estructura iterativa ForOf
        ForEach es un metodo iterativo perteneciente a la clase ArrayList, itera hasta recorrer por completo la coleccion,
        utilizamos una funcion lambda para especifar las instrucciones que se ejecutaran en cada iteracion.
     */
        comandosLinux.forEach((String comando) -> System.out.println( comando.toUpperCase()));  //Recorremos nuevamente toda la coleccion mostrando todos los comandos pero esta vez en mayuscula.
    }
}
