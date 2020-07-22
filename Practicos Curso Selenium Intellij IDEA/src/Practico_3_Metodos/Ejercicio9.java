package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio9 {/*Crear un método que permita recibir el radio de un círculo, y retorne su area
             (radio^2)*PI (utilizar una variable estática para el valor de PI)*/
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio de un círculo");
        double radio = input.nextDouble();

        System.out.println("El área del círculo es de " + areaCirculo(radio) + " cm2");
    }

    public static double areaCirculo (double radio) {
        double area = Math.PI * (radio * radio);
        return area;
    }
}
