package Ejercicios;

import java.util.Scanner;

public class EjerciciosBasicosBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, hora, minutos, segundos, par;
        char letra;

        // Numero natural: Solicita un número hasta que te introduzcan un número natural
        // (positivo)

        do {
            System.out.println("Dime un número natural positivo (mayor que 0): ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Corrrecto, " + num + " es un número natural positivo.");

        // Hora: Solicita una hora (hora,minutos,segundos) en una única línea, separada
        // por espacios. Si los datos son incorrectos, vuelve a solicitar los datos.

        do {
            System.out.print("Ingrese la hora (hora minutos segundos separados por espacios): ");
            hora = sc.nextInt();
            minutos = sc.nextInt();
            segundos = sc.nextInt();

            // Verificar si los datos son incorrectos
            if (!(hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60)) {
                System.out.println("Error: Datos incorrectos. Por favor, ingrese una hora válida.");
            }

        } while (!((hora >= 0 && hora < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60)));

        System.out.println("Hora ingresada: " + hora + ":" + minutos + ":" + segundos);

        // Par: Solicita un número PAR, si el número introducido no es un número par
        // vuelve a solicitar el número.

        do {
            System.out.print("Dime un número par: ");
            par = sc.nextInt();

        } while (!(par % 2 == 0));

        System.out.println("El número " + par + " es par, bien hecho.");

        // Positivo: Solicita un número positivo, si el número introducido no es un
        // número positivo vuelve a solicitar el número.

        do {
            System.out.println("Dime un número POSITIVO (mayor que 0): ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Corrrecto, " + num + " es un número positivo.");

        // Pasar a mayúscula: Solicita una letra mayúscula, si dato introducido no es
        // una letra mayúscula, pero si una letra minúscula, pasalá a mayúscula. En caso
        // de no ser ni una letra mayúscula ni una letra minúscula, vuelve a solicitar
        // la letra.

        do {
            System.out.print("Ingrese una letra mayúscula: ");
            letra = sc.next().charAt(0);

            if (Character.isLowerCase(letra)) {
                // Si es una letra minúscula, conviértela a mayúscula
                letra = Character.toUpperCase(letra);
                System.out.println("La letra ingresada era minúscula. Convertida a mayúscula: " + letra);
            } else if (!Character.isUpperCase(letra)) {
                // Si no es una letra mayúscula ni minúscula, muestra un mensaje de error
                System.out.println("Error: Ingresa una letra mayúscula o minúscula válida.");
            }

        } while (!Character.isUpperCase(letra));

        System.out.println("Correcto, ingresaste la letra mayúscula: " + letra);
    }

}
