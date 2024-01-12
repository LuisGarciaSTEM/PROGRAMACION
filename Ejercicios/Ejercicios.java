package Ejercicios;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pedirNum;
        int pedirNum2;
        int num1;
        int num2;
        int suma;
        int multiplicacion;
        int division;
        int resta;
        String operacion;

        /*
         * 1.- Condición básica.
         * Crea una variable y dale un valor.
         * Si dicho valor es menor que 5, que escriba por pantalla 'es menor que 5'. Si
         * es mayor que 5, que escriba por pantalla 'es mayor que 5. Si es igual a 5,
         * que escriba por pantalla 'es 5'.
         * 
         * 
         * int num1 = 5;
         * 
         * System.out.println("Dime un número");
         * pedirNum = sc.nextInt();
         * 
         * if (pedirNum < num1){
         * System.out.println("Es menor que 5.");
         * } else if (pedirNum > num1) {
         * System.out.println("Es mayor que 5.");
         * } else {
         * System.out.println("Son iguales");
         * }
         */

        /*
         * 2.- Variable introducida por teclado.
         * Solicita un valor para una variable numérica. Si dicho valor es menor que 0,
         * que escriba por pantalla 'es un número negativo'. Si dicho valor es mayor o
         * igual que 0, que escriba por pantalla 'es un número positivo'.
         * 
         * System.out.println("Dime un número para saber si es positivo o negativo: ");
         * pedirNum = sc.nextInt();
         * if (pedirNum < 0) System.out.println("El número es negativo.");
         * else System.out.println("El número es positivo.");
         */

        /*
         * 3.- Argumentos introducidos al ejecutar.
         * A la hora de ejecutar el código, añade un número que pasará como argumento
         * del main.
         * Gestiona que realemente introduce un único argumento, ni más ni menos.
         * Si dicho valor es menor que 0, que escriba por pantalla 'es un número
         * negativo'.
         * Si dicho valor es mayor o igual que 0, que escriba por pantalla 'es un número
         * positivo'.
         * Gestiona para que, si el número de argumentos es incorrectos, los solicite
         * desde teclado.
         * 
         * if (args.length == 1) {
         * int numero = Integer.parseInt(args[0]);
         * if (numero >= 0)
         * System.out.println("El número es positivo");
         * else
         * System.out.println("El número es negativo");
         * } else {
         * System.out.println("Dime un número");
         * pedirNum = sc.nextInt();
         * if (pedirNum < 0)
         * System.out.println("El número es negativo.");
         * else
         * System.out.println("El número es positivo.");
         * }
         */

        /*
         * 4.- Varios argumentos introducidos al ejecutar.
         * A la hora de ejecutar el código, añade dos números que pasarán como argumento
         * del main.
         * Gestiona que realemente introduce dos argumentos, ni más ni menos.
         * Hay que imprimir por pantalla el número que sea mayor. Gestiona para que, si
         * el número de argumentos es incorrectos, los solicite desde teclado.
         * 
         * 
         * if (args.length == 2) {
         * int num1 = Integer.parseInt(args[0]);
         * int num2 = Integer.parseInt(args[1]);
         * 
         * if (num1 > num2)
         * System.out.println("El número " + num1 + " es mayor que " + num2);
         * else if (num1 < num2)
         * System.out.println("El número " + num2 + " es mayor que " + num1);
         * else
         * System.out.println("Los números son iguales. Son el: " + num1);
         * } else {
         * System.out.
         * println("Introduce 2 números separados por un espacio para saber cuál es el mayor: "
         * );
         * pedirNum = sc.nextInt();
         * pedirNum2 = sc.nextInt();
         * 
         * if (pedirNum > pedirNum2)
         * System.out.println("El número " + pedirNum + " es mayor que " + pedirNum2);
         * else if (pedirNum < pedirNum2)
         * System.out.println("El número " + pedirNum2 + " es mayor que " + pedirNum);
         * else
         * System.out.println("Los números son iguales. Son el: " + pedirNum);
         * }
         */
        /*
         * 5.- Calculadora en Switch.
         * Solicita por teclado dos números y la palabra operación (suma, resta,
         * multiplicación, división). El programa debe realizar la operación
         * correspondiente. Modifícalo para que pueda funcionar tanto los datos
         * introducidos por teclado como introduciendole argumentos al main.
         */
        System.out.println("Dime el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Dime el segundo número: ");
        num2 = sc.nextInt();

        sc.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Dime la operación que quieres realizar: ");
        operacion = sc.nextLine().toLowerCase();
        switch (operacion) {
            case "suma":
                suma = num1 + num2;
                System.out.println("El resultado de la suma es: " + suma);
                break;

            case "resta":
                resta = num1 - num2;
                System.out.println("El resultado de la resta es: " + resta);
                break;

            case "division":
                division = num1 / num2;
                System.out.println("El resultado de la division es: " + division);
                break;

            case "multiplicacion":
                multiplicacion = num1 * num2;
                System.out.println("El resultado de la mutiplicación es: " + multiplicacion);
                break;

            default:
                System.out.println("Has introducido otra cosa, mira bien lo que has escrito.");
                break;
        }

    }

}
