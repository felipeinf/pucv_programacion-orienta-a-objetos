package main;

/**
 * @author Felipe Concha Almeida
 */

public class Conversiones {
    public static void main(String[] args) {
    // Casting forzado
        int entero1;
        double flotanteDoble1;

        flotanteDoble1 = (double) 7 / 9; //Exactitud: El resultado de la division entre dos datos tipo int es un numero entero, sin embargo hacemos casting a double para obtener un resultado exacto.
        entero1 = (int) flotanteDoble1;  //Estimacion: Esto solo quita los decimales, sin redondear ni aproximar.

    // Casting automatico
        char caracter1;
        int caracterEntero1;
        double flotanteDoble2;
        int entero2;

        entero2 = 235;
        caracter = '1';      

        caracterEntero = caracter;  //De char a int, se efectua casting automatico.
        flotanteDoble2 =  entero2;  //De entero a double, se efectua casting automatico.
 
    // Parsing 
        int entero3 = Integer.parseInt("245"); 
        double flotante2 = Double.parseFloat("3.56");
    }
}