package Ejercicios;

import java.util.Scanner;

public class EjemploBucleForGeneradorAleatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor mínimo del rango: ");
        int minimo = sc.nextInt();

        System.out.print("Ingrese el valor máximo del rango: ");
        int maximo = sc.nextInt();

        System.out.print("Ingrese la cantidad de números aleatorios a generar: ");
        int cantidadNumeros = sc.nextInt();

        for (int i = 1; i <= cantidadNumeros; i++) {
            int numeroAleatorio = generarNumeroAleatorio(minimo, maximo);
            System.out.println("Número aleatorio " + i + ": " + numeroAleatorio);
        }
    }

    // Función que genera un número aleatorio dentro de un rango
    public static int generarNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    }
}