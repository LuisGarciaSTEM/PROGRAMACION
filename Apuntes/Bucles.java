import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int numero;
        boolean salir = true;

        // For each -> for color in listaColores
        String[] listaAzules = { "Azul", "Añil", "Indigo", "Cobalto", "Klein" };
        for (String azul : listaAzules) {
            System.out.println(azul);

        }

        // For -> NO existe en Python...
        // for (incializmos variables; condicion while; de cuánto en cuánto van
        // aumentando)
        for (int contador = 0; contador < 10 + 1; contador++) {
            System.out.println(contador);
        }

        // i de Iterador
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("" + i + j + " ");
            }

        }

        System.out.println("Bucles doWhile");
        // do {...} while()
        do {
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        } while (!palabra.equals("salir"));

        do {
            System.out.println("Introduce un número entre 1 y 50: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 50);


        System.out.println("Bucle while");
        while (!salir) {
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
            if (palabra.equals("salir")) {
                salir = true;
            }
        }

    }
}
