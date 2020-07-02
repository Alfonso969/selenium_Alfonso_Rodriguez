package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio1 { //Escribir un método que reciba un número y retorne su doble
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un número");
        num = input.nextInt();
        int duplicado = mostrarDoble(num);
        System.out.println("El doble del número que ingresó es " + duplicado);
    }

    public static int mostrarDoble (int num) {
        return num * 2;
    }
}
