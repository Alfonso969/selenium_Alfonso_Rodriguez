package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio4 { //Método que reciba dos números y retorne su suma.
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Ingrese un número");
        num1 = input.nextInt();

        System.out.println("Ingrese otro número");
        num2 = input.nextInt();

        int suma = sumatoria(num1, num2); /*parece que este paso no es necesario, se puede poner
        sumatoria (num1, num2) en el System.out.println() de abajo*/

        System.out.println("La suma de los números que usted ingresó es " + suma);
    }

    public static int sumatoria (int num1, int num2) {
        return (num1 + num2);
    }
}
