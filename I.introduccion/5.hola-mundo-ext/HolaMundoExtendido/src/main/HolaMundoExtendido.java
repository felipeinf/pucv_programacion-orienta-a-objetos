package main;

/**
 * @author Felipe Concha Almeida
 */

import java.util.Scanner;

public class HolaMundoExtendido {
    public static void main(String[] args) {
        Scanner scanner;
        String lectura;

        String nombreMundo;
        int cantidadLunas;

        scanner = new Scanner(System.in); //Se instancia el objeto scanner el cual utilizaremos para leer desde el input(System.in).

        System.out.print("Por favor ingrese el nombre de su mundo: ");
        lectura = scanner.nextLine();
        nombreMundo = lectura;

        System.out.print("Por favor el numero de lunas de su mundo");
        lectura = scanner.nextLine();
        cantidadLunas = Integer.parseInt(lectura);

        scanner.close(); //Despues de la/s lectura/s se cierra el Scanner.

        System.out.println("\n" + "Hola "+ nombreMundo); //Al igual que en C, utilizamos \n para hacer saltos de linea.
        System.out.println("Numero de lunas: " + cantidadLunas);
    }
}