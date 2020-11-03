import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Escriba un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Escriba otro numero");
        int numero2 = sc.nextInt();
        if (numero1 < numero2) {
            for (i = numero1; i <= numero2; i++) {
                System.out.println(numero1 + "+" + (numero1 + 1) + " = " + (numero1 + (numero1 + 1)));
                numero1++;
            }
        } else {
            for (i = numero2; i <= numero1; i++) {

                System.out.println(numero2 + "+" + (numero2 + 1) + " = " + (numero2 + (numero2 + 1)));
                numero2++;
            }

        }
    }
}
