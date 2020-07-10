package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio5 { /*Método que reciba un número entero y un número double, y retorne su multiplicación.
¿Qué tipo de retorno tiene este método?*/
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int num1 = input.nextInt();

        System.out.println("Ingrese un número decimal");
        double num2 = input.nextDouble();

        System.out.println("La multiplicación de ambos es " + multiplicacion(num1, num2));
    }

    public static double multiplicacion (int num1, double num2) {
        double multiplicacion = num1 * num2;
        return multiplicacion;
    }
}
