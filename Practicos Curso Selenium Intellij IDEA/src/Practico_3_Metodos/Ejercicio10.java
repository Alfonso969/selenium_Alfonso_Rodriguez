package Practico_3_Metodos;

import java.util.Scanner;

public class Ejercicio10 {/*Crear un método que permita recibir el alto y ancho de un paralelogramo tipo,
             y retorne su área.*/
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la base de un paralelogramo tipo");
        float base = input.nextFloat();

        System.out.println("Ingrese el alto del mismo paralelogramo");
        float alto = input.nextFloat();

        System.out.println("El área del paralelogramo es de " + areaParalelogramo(base, alto) + " cm2");
    }

    public static double areaParalelogramo (float base, float alto) {
        double area = base * alto;
        return area;
    }
}
