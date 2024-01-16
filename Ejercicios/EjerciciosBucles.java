package Ejercicios;

import java.util.Scanner;

public class EjerciciosBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        char letra;

        // Numero natural: Solicita un número hasta que te introduzcan un número natural
        // (positivo).
        /*
         * do {
         * System.out.println("Dime un número natural positivo!!! : ");
         * numero = sc.nextInt();
         * } while (numero < 0);
         */

        // Solicita una letra y comprueba que es una letra.
        System.out.println("Introduce una letra: ");

        // sc.nextLine() esto devuelve un string.
        // Con un String podemos llamar a la función charAt(indice) que te devuelve el
        // char que har en al posición indice.
        // Ej. Si introduce la palabra "patata" coge la 'p'
        letra = sc.nextLine().charAt(0);
        if (letra >= 'a' && letra <= 'z') {
            System.out.println("Es una letra.");
        }

    }
}
