package Bucles.sesion06For;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué número quiere introducir?:");
        int numero1 = sc.nextInt();
        System.out.println("¿Introduzca otro número?:");
        int numero2 = sc.nextInt();
        System.out.println("¿A que potencia quiere elevarlo?:");
        var caracter = sc.next();
        int i;
        int j;

        for (j = 1; j <= numero; j++) {
            System.out.println("");
            for (i = 1; i <= numero; i++) {
                System.out.print(caracter);
            }
        }


    }
}