package Ejercicios;

import java.util.Scanner;

public class EjerciciosBasicosBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        // Numero natural: Solicita un número hasta que te introduzcan un número natural
        // (positivo)

        do {
            System.out.println("Dime un número natural positivo (mayor que 0): ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Corrrecto, " + num + " es un número positivo.");

    }
}
