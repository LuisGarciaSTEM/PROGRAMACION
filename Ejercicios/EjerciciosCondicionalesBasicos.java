package Ejercicios;

import java.util.Scanner;

public class EjerciciosCondicionalesBasicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0, max = 120, numero;

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

        // Pasar a positivo: Solicita un número positivo, si el número introducido es
        // negativo pásalo a positivo.

        System.out.println("Dime un número positivo: ");
        numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo!! ");
        } else {
            System.out.println("¡¡ ERROR !! El número NO es positivo!!");
            numero = numero * -1;
            System.out.println("Número final (convertido a positivo): " + numero);
        }

        // Comprendido entre: Solicita una número y asegúrate de que está comprendida
        // entre otros dos números introducidos, si el número introducido no cumple la
        // condición, lanza un mensaje de error.

        System.out.println("Dime un número: ");
        numero = sc.nextInt();
        System.out.println("Dime 2 número para saber si el otro esta dentro de los rangos.");
        min = sc.nextInt();
        max = sc.nextInt();
        if (numero >= min && numero <= max) {
            System.out.println("El número " + numero + " está dentro del rango!! ");
        } else {
            System.out.println("¡¡ ERROR !! El número NO ESTÁ entre:" + min + max + " !!");
        }

        // Rango de edad: Solicita una edad y asegúrate de que está comprendida entre 0
        // y 120 años, si el número introducido no cumple la condición, lanza un mensaje
        // de error.

        System.out.println("Dime un número: ");
        numero = sc.nextInt();
        if (numero > 0 && numero < 120) {
            System.out.println("El número " + numero + " está dentro del rango!! ");
        } else {
            System.out.println("¡¡ ERROR !! El número NO ESTÁ entre:" + min + max + " !!");
        }

        // Vocal: Solicita una vocal, si dato introducido no es una vocal, lanza un
        // mensaje de error. [!] Ascii.

        System.out.println("Dime una letra para saber si es vocal. ");
        char vocal = sc.next().toLowerCase().charAt(0);

        // Verificar si el carácter introducido es una vocal (usando valores ASCII)
        if ((vocal >= 'a' && vocal <= 'e')
                || (vocal >= 'i' && vocal <= 'o')
                || (vocal >= 'u' && vocal <= 'u')) {
            System.out.println("¡Excelente! Has introducido la vocal: " + vocal);
        } else {
            System.out.println("¡Error! El carácter introducido no es una vocal.");
        }

        // Mayúscula: Solicita una letra mayúscula, si dato introducido no es una letra
        // mayúscula, lanza un mensaje de error
        System.out.println("Introduce una letra mayúscula: ");
        char letraMayuscula = sc.next().charAt(0);

        if (letraMayuscula >= 'A' && letraMayuscula <= 'Z') {
            System.out.println("¡Excelente! Has introducido la letra mayúscula: " + letraMayuscula);
        } else {
            System.out.println("¡Error! El carácter introducido no es una letra mayúscula.");
        }

    }
}
