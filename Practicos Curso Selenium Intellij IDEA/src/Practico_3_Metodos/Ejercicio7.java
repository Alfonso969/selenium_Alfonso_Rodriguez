package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio7 {/*Crear un método que reciba un número entero n, y muestre en pantalla la suma desde
1 hasta ese número n. Ej. Si n es 4, se debe mostrar en pantalla 10.*/
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int num = input.nextInt();

        System.out.println("La sumatoria desde 1 hasta " + num + " es " + sumatoriaDeNumeros(num));
    }

    public static int sumatoriaDeNumeros (int num) {
        int suma = 0;

        if (num > 0) {
            for (int i=1; i <= num; i++) {
                suma = suma + i;
            }
        } else {
            for (int i=1; i >= num; i--) {
                suma = suma + i;
            }
        }
        return suma;
    }
}
