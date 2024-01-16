package Ejercicios;

import java.util.Scanner;

public class EjerciciosBucles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        char letra;
        
        // Numero natural: Solicita un número hasta que te introduzcan un número natural (positivo).
       
        do {
            System.out.println("Dime un número natural positivo!!! : ");
            numero = sc.nextInt();
        } while (numero < 0);
        
        // Solicita una letra 

        System.out.println("Introduce una letra: ");

    }
}
