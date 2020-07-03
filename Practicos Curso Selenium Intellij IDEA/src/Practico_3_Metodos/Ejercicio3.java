package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio3 {//Método que reciba dos enteros y retorne la multiplicación de los mismos.
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Ingrese un número entero");
        num1 = input.nextInt();
        //System.out.println("Los números que se encuentran definidos en las variables son " + num1 + " y " + num2);

        System.out.println("Ingrese otro número entero");
        num2 = input.nextInt();
        //System.out.println("Los números que se encuentran definidos en las variables son " + num1 + " y " + num2);

        int multiplicacion = multiplicar(num1, num2);

        System.out.println("La multiplicación de los números que ingresó es " + multiplicacion);
    }

    public static int multiplicar (int num1, int num2) {
        return (num1 * num2);
    }
}
