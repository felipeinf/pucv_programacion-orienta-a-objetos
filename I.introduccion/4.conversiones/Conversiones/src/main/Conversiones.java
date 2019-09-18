package main;

/**
 * @author Felipe Concha Almeida
 */

public class Conversiones {
    public static void main(String[] args) {
    // Casting forzado
        int entero1;
        double flotanteDoble1;

        flotanteDoble1 = (double) 23 / 9; //Exactitud: El resultado de la division entre dos datos tipo int es un numero entero, sin embargo hacemos casting a double para obtener un resultado exacto.
        System.out.println("Exactitud: \n");        
        System.out.println("flotanteDoble1 = " + flotanteDoble1);
        
        entero1 = (int) flotanteDoble1;  //Estimacion: Esto solo quita los decimales, sin redondear ni aproximar.
        System.out.println("\nEstimacion: \n");        
        System.out.println("entero1 = " + entero1);
        
    // Casting automatico
        char caracter1;
        int caracterEntero1;
     
        caracter1 = '1';      
        caracterEntero1 = caracter1;  //De char a int, se efectua casting automatico.
        
        double flotanteDoble2;
        int entero2;
        
        entero2 = 235;
        flotanteDoble2 = entero2;  //De int a double, se efectua casting automatico.

        System.out.println("\nCasting automatico: \n");
        System.out.println("entero2 = " + entero2);
        System.out.println("flotanteDoble2 = " + flotanteDoble2);  
        
    // Parsing 
        int entero3;
        double flotanteDoble3;
        String cadena;

        cadena = "255";
        
        entero3 = Integer.parseInt(cadena);  //Hacemos un parsing de String a int
        flotanteDoble3 = Double.parseDouble("3.536");  //Hacemos un parging de String literal a float
        
        System.out.println("\nParsing: \n");
        System.out.println("flotanteDoble3 = " + flotanteDoble3);
    }
}