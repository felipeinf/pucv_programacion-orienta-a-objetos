package main;

/**
 * @author Felipe Concha Almeida
 */

import java.util.Scanner;
 
public class EstructurasSelectivas {

    public static void main(String[] args) {
        int numero;
        Scanner scanner;
        String lectura;
        
        scanner = new Scanner(System.in); //Se instancia el objeto scanner el cual utilizaremos para leer desde el input(System.in).
        
        System.out.println("Ingrese un numero entero: ");
        lectura = scanner.nextLine();
        numero = Integer.parseInt(lectura);
                
    // If else
        if(numero % 4 == 0){
            System.out.println("El numero " + numero + " es multiplo de 4.");
            
            if(numero % 3 == 0){
                System.out.println("El numero " + numero + " es multiplo de 4 y de 3. ");
            }
        }
        else {
            System.out.println("El numero " + numero + " no es multiplo de 4.");
        }
          

    // Switch
        int opcion; 

        System.out.print("\nIngrese la opcion 1, 2 o 3: ");
        lectura = scanner.nextLine(); //Se lee como String.
        opcion = Integer.parseInt(lectura);  //Hacemos un parsing a lectura para covertir la cadena en un entero.
        scanner.close();

        switch (opcion) {
            case 1:
                System.out.println("Opcion 1");
            break;
        
            case 2:
                System.out.println("Opcion 2");
            break;

            case 3:
                System.out.println("Opcion 3");
            break;
        
            default:
                System.out.println("Opcion invalida.");
            break;
        }
    }
}