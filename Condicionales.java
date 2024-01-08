import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        int numero = 3;

        if (numero < 5) {
            System.out.println("El número es menor que 5");
        } else if (numero == 5) {
            System.out.println("El número es igual a 5");
        } else {
            System.out.println("El número es mayor que 5");
        }

        /* Solicita un número por teclado, y di si es positivo o negativo. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número, para saber si es positivo o negativo.");
        int pedirNumero = sc.nextInt();
        

        if (pedirNumero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }

    }
}
