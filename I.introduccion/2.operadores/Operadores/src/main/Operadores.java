package main;

/**
 * @author Felipe Concha Almeida
 */

public class Operadores {
    public static void main(String[] args) {
        int a = 9;
        int b;

    //Operadores aritmeticos
        System.out.print(a * 3); //Operador de multiplicacion: *                | Output: 27
        System.out.print(a / 3); //Operador de divicion: /                      | Output: 3
        System.out.print(a + 3); //Operador de suma: +                          | Output: 12
        System.out.print(a - 3); //Operador de resta: -                         | Output: 6
        System.out.print(a % 2); //Operador de modulo (residuo de division): %  | Output: 1

    //Operadores de incremento(++) y decremento(--)
        a = 3;
        --a;
        System.out.print(a); //Output: 2

        //Sufijos: realizan el incremento o decremento despues
        System.out.print(a++); //Output: 2
        System.out.print(a); //Output: 3

        //Prefijos: realizan el incremento o decremento primero
        System.out.print(++a); //Ouput 4

    //Operadores Relacionales
        a = 8;
        b = 2;   
        
        System.out.println("a es mayor a b ? " + (a > b));
        System.out.println("a es menor a b ? " + (a < b));
        System.out.println("a es mayor o igual que b ? " + (a >= b));
        System.out.println("a es menor o igual que b ? " + (a <= b));
        System.out.println("a es igual que b ? " + (a == b));
        System.out.println("a es diferente que b ? " + (a != b));

    //Operadores Logicos
        System.out.println("Se cumple la condicion 1  Y  condicion 2: " + ((a == 8) && (b == 2))); //Operador AND: &&  
        System.out.println("Se cumple la condicion 1  O  la condicion 2: " + ((a == 2) || (b == 2))); //Operador OR: ||        
    }
}