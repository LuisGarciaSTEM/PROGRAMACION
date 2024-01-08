import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        int numero = 3;
        String palabra;
        Scanner sc = new Scanner(System.in);

        if (numero < 5) {
            System.out.println("El número es menor que 5");
        } else if (numero == 5) {
            System.out.println("El número es igual a 5");
        } else {
            System.out.println("El número es mayor que 5");
        }

        /* Solicita un número por teclado, y di si es positivo o negativo. */

        System.out.println("Dime un número, para saber si es positivo o negativo.");
        int pedirNumero = sc.nextInt();

        if (pedirNumero < 0) {
            System.out.println("El número es: " + pedirNumero + " y es negativo");
        } else {
            System.out.println("El número es: " + pedirNumero + " y es positivo");
        }

        sc.nextLine(); // Coge el salto de linea que ha dejado nextInt
        System.out.println("Dime un palabra, y la repito.");
        palabra = sc.nextLine();
        if (palabra == "caca") {
            System.out.println("La palabra " + palabra + " = a");
        } else {
            System.out.println("La palabra " + palabra + " != a");
        }

    }
}
