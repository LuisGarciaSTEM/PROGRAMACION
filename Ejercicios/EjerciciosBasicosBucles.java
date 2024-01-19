package Ejercicios;

import java.util.Scanner;

public class EjerciciosBasicosBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, hora, minutos, segundos;

        // Numero natural: Solicita un número hasta que te introduzcan un número natural
        // (positivo)

        do {
            System.out.println("Dime un número natural positivo (mayor que 0): ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Corrrecto, " + num + " es un número positivo.");

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

    }
}
