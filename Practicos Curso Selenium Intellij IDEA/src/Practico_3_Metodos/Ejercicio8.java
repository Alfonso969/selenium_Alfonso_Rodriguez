package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio8 {/*Crear un método que retorne verdadero si y sólo si el número es par.
De lo contrario, debe retornar falso*/
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = input.nextInt();

        if (esPar(num)) {
            System.out.println("El número que usted ingresó es par");
        } else {
            System.out.println("El número que usted ingresó no es par");
        }
    }

    public static boolean esPar (int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
