package main;

/**
 * @author Felipe Concha Almeida
 */
public class Operadores {
    public static void main(String[] args) {
        int a = 9;
        int b;

        //Operadores aritmeticos
        System.out.println("Operadores Aritmeticos: \n");

        System.out.print("a = ");
        System.out.println(a);

        System.out.print("a * 3 = ");
        System.out.println(a * 3); //Operador de multiplicacion: *                | Output: 27

        System.out.print("a / 3 = ");
        System.out.println(a / 3); //Operador de divicion: /                      | Output: 3

        System.out.print("a + 3 = ");
        System.out.println(a + 3); //Operador de suma: +                          | Output: 12

        System.out.print("a - 3 = ");
        System.out.println(a - 3); //Operador de resta: -                         | Output: 6

        System.out.print("a % 2 = ");
        System.out.println(a % 2); //Operador de modulo (residuo de division): %  | Output: 1

        //Operadores de incremento(++) y decremento(--)
        System.out.println("\nOperadores de Incremento y Decremento: \n");

        a = 3;
        System.out.print("a = ");
        System.out.println(a);

        System.out.print("--a = ");
        System.out.println(--a); //Output: 2

        //Sufijos: realizan el incremento o decremento despues
        System.out.print("a++ = ");
        System.out.println(a++); //Output: 2

        System.out.print("a = ");
        System.out.println(a); //Output: 3

        //Prefijos: realizan el incremento o decremento primero
        System.out.print("++a = ");
        System.out.println(++a); //Ouput 4

        //Operadores Relacionales
        System.out.println("\nOperadores Relacionales: \n");

        a = 8;
        b = 2;

        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);

        System.out.print("a es mayor a b ? :");
        System.out.println(a > b);

        System.out.print("a es menor a b ? :");
        System.out.println(a < b);

        System.out.print("a es mayor o igual que b ? :");
        System.out.println(a >= b);

        System.out.print("a es menor o igual que b ? :");
        System.out.println(a <= b);

        System.out.print("a es igual que b ? :");
        System.out.println(a == b);

        System.out.print("a es diferente que b ? :");
        System.out.println(a != b);

        //Operadores Logicos
        System.out.println("\nOperadores Logicos\n");

        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);

        System.out.println("Se cumple la condicion1 (a = 8)?  Y  condicion2 (b = 2)? : " + ((a == 8) && (b == 2))); //Operador AND: &&  
        System.out.println("Se cumple la condicion1 (a = 2)? O  la condicion2 (b = 2)? : " + ((a == 2) || (b == 2))); //Operador OR: ||        
    }
}