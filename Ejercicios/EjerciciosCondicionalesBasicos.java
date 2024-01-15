package Ejercicios;

import java.util.Scanner;

public class EjerciciosCondicionalesBasicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0, max = 100, numero;

        /*
         * Numero natural: Solicita un número, si es menor que 0 imprime que no es un
         * número natural.
         */
        
        System.out.println("Dime un número para saber si es natural: ");
        numero = sc.nextInt();
        if (numero < min) {
            System.out.println("No es un número natural.");
        } else if (numero > min) {
            System.out.println("Sí es un número natural.");
        } else {
            System.out.println("Has introducido algo erroneo.");
        }
    }
}
