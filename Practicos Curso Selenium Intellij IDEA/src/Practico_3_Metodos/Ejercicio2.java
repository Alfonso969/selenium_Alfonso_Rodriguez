package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio2 { /*Método que reciba un número entero e imprima en pantalla en caso de ser mayor a 20,
“Es mayor a 20”. De lo contrario, imprimir “No es mayor a 20”.*/
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("Ingrese un número");
        num = input.nextInt();

        if (num > 20) {
            System.out.println("El número es mayor a 20");
        } else {
            System.out.println("El número NO es mayor a 20");
        }
    }
}
