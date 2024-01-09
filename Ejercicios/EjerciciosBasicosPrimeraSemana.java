package Ejercicios;

import java.util.Scanner;

public class EjerciciosBasicosPrimeraSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 4.- Varios argumentos introducidos al ejecutar.
         * A la hora de ejecutar el código, añade dos números que pasarán como argumento
         * del main.
         * Gestiona que realemente introduce dos argumentos, ni más ni menos.
         * Hay que imprimir por pantalla el número que sea mayor.
         * Gestiona para que, si el número de argumentos es incorrectos, los solicite
         * desde teclado.
         */
        int pedirNumero1;
        int pedirNumero2;
        System.out.println("Dime 2 números: ");
        
        pedirNumero1 = sc.nextInt();
        pedirNumero2 = sc.nextInt();

        if (pedirNumero1 > pedirNumero2){
            System.out.println("El número más grande es el número " + pedirNumero1);
        } else if (pedirNumero2 > pedirNumero1) {
            System.out.println("El número más grande es el número " + pedirNumero2);
        } else {
            System.out.println("Son iguales");
        }
        
        System.out.println("El número uno: " + pedirNumero1 + "\nEl segundo número: " + pedirNumero2);
    }
}
