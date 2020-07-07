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

/*SOLUCIÓN: Se puede crear un método que contenga IFs y ELSEs
public class ejercicio2 {

    public static void main (String args []){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = input.nextInt();

        if (esMayor(numero) == true){
            System.out.println("El numero ingresado es mayor a 20");
        } else{
            System.out.println("El numero ingresado es menor a 20");
        }

    }

    public static boolean esMayor (int numero){
        if (numero > 20){
            return true;
        } else {
            return false;
        }
     }
}
 */
