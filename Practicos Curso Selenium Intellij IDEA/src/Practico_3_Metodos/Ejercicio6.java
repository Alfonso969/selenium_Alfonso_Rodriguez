package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio6 {//Realizar un método que reciba dos números y retorne el mayor de ambos.
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1 = input.nextInt();

        System.out.println("Ingrese otro número");
        int num2 = input.nextInt();

        if (esMayor(num1, num2)) {
            System.out.println("El número mayor de los que ingresó es el " + num1);
        } else {
            System.out.println("El número mayor de los que ingresó es el " + num2);
        }
    }

    public static boolean esMayor (int num1, int num2) {
        if (num1 > num2) {
            return true;
        } else {
            return false;
        }
    }
}
