package Ejercicios;

import java.util.Scanner;

public class EjerciciosCondicionalesBasicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0, max = 100, numero;

        /*
         * Numero natural: Solicita un número, si es menor que 0 imprime que no es un
         * número natural.
         *
         * System.out.println("Dime un número para saber si es natural: ");
         * numero = sc.nextInt();
         * if (numero < min) {
         * System.out.println("No es un número natural.");
         * } else if (numero > min) {
         * System.out.println("Sí es un número natural.");
         * } else {
         * System.out.println("Has introducido algo erroneo.");
         * }
         * 
         */

        /*
         * - Hora: Solicita una hora (hora,minutos,segundos) en una única línea,
         * separada por espacios.
         * Si los datos son incorrectos, lanza un mensaje de error.
         * 
         * System.out.
         * print("Ingrese la hora (hora minutos segundos separados por espacios): ");
         * int hora = sc.nextInt();
         * int minutos = sc.nextInt();
         * int segundos = sc.nextInt();
         * if ((hora >= 0 && hora < 24) && (minutos >= 0 && minutos < 60) && (segundos
         * >= 0 && segundos < 60)) {
         * System.out.println("Hora ingresada: " + hora + ":" + minutos + ":" +
         * segundos);
         * } else {
         * System.out.println("Error: La hora ingresada es inválida.");
         * }
         */

        /*
         * Par: Solicita un número par, si el número introducido no es un número par
         * lanza un mensaje de error.
         * 
         * 
         * System.out.println("Dime un número para saber si es par o no.");
         * numero = sc.nextInt();
         * 
         * if (numero % 2 == 0) {
         * System.out.println("El número es par!");
         * } else {
         * System.out.println("Es impar!");
         * }
         */

        /*
         * Pasar a par: Solicita un número par, si el número introducido es impar súmale
         * uno.
         * 
         * System.out.println("Dime un número par: ");
         * numero = sc.nextInt();
         * 
         * if (numero % 2 == 0) {
         * System.out.println("El número es par!");
         * } else {
         * System.out.println("Es impar! Número final: ");
         * System.out.println( numero + 1);
         * }
         */

        // Positivo: Solicita un número positivo, si el número introducido no es un
        // número positivo lanza un mensaje de error.
        System.out.println("Dime un número positivo: ");
        numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo!! ");
        } else {
            System.out.println("¡¡ ERROR !! El número " + numero + " NO es positivo!! ");
        }
        
        
    }
}
