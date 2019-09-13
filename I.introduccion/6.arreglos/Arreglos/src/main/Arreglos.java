package main;

/**
 * @author Felipe Concha Almeida
 */

import java.util.ArrayList;

public class Arreglos {
    public static void main(String[] args) {
        //Areglos
        String[] diasSemana = new String [7]; //Esta es otra forma de declarar un arreglo, se utiliza la palabra reservada new para especificar el tamaño de este.
        int[] arregloEnteros = { 1, 3 , 5, 7, 9 }; //Esta es una forma de declarar un arreglo e inicializarlo.

        arregloEnteros[2] = 420; //Se puede acceder a una posicion del arreglo de la misma forma que en lenguaje C.
        System.out.println(arregloEnteros[2]); //Output: 420

        diasSemana[0] = "LUNES";
        diasSemana[1] = "MARTES";
        diasSemana[2] = "MIERCOLES";
        diasSemana[3] = "JUEVES";
        
        diasSemana[5] = "SABADO";
        diasSemana[6] = "DOMINGO";
        
        // Colecciones
        int capacidad;

        capacidad = 5;
        ArrayList<Integer> integerArrayList = new ArrayList<>(capacidad);  //Se declara una coleccion ArrayList de Integer y se especifica su capacidad.
        integerArrayList.add(6);  //ArrayList viene con una serie de metodos (funciones propias de una clase) predefinidos,  como add(), sort(), remove(), size(), etc.
        integerArrayList.add(3);
        integerArrayList.add(9);
        integerArrayList.add(4);
        integerArrayList.add(2);

        System.out.println(integerArrayList); //Output: [6, 3, 9, 4, 2]

        /* Para utilizar el metodo sort() de la clase ArrayList, al igual que lo haciamos con qsort() en lenguaje C,
            debemos traspasar una funcion de comparacion para que se efectue el orden. En este caso utilizaremos una
            LambdaFunction como funcion de comparacion.

            Funcion Lambda: Desde la version 8 de Java, disponemos de LambdaFunctions las cuales fascilitan algunas tareas
                            al utilizar el lenguaje. A continuacion, se presenta un ejemplo de una funcion lambda que imprime
                            un parametro recibido.

            (parametro) -> {
                System.out.println("Parametro " + parametro1);
            }

            En el caso de que sea solo una instruccion podriamos, usar la sigueinte sintaxis alternativa:

            (Tipo/clase parametro) -> System.out.println("Parametro " + parametro1); 
        */

        integerArrayList.sort((Integer a, Integer b) -> {
            return a - b;
        }); //Ordena de menor a mayor

        System.out.println("Ordenado de menor a mayor: " + integerArrayList); //Output: Ordenado de menor a mayor: [2, 3, 4, 6, 9]

        integerArrayList.sort((Integer a, Integer b) -> {
            return b - a;
        });

        /* En este caso esto es equivalente a lo anterior, ya que la funcion lambda solo tiene una
            instruccion, por lo que se pueden evitar los corchetes como se menciono anteriormente.

        integerArrayList.sort( (Integer a, Integer b) -> b - a );  //Ordena de mayor a menor

        */

        System.out.println("Ordenado de mayor a menor: " + integerArrayList);
    }
}