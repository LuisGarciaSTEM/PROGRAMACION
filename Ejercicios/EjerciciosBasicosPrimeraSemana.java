package Ejercicios;

import java.util.Scanner;

public class EjerciciosBasicosPrimeraSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pedirNombre;
        int pedirNumero1;

        /*
         * 4.- Varios argumentos introducidos al ejecutar.
         * A la hora de ejecutar el código, añade dos números que pasarán como argumento
         * del main.
         * Gestiona que realemente introduce dos argumentos, ni más ni menos.
         * Hay que imprimir por pantalla el número que sea mayor.
         * Gestiona para que, si el número de argumentos es incorrectos, los solicite
         * desde teclado.
         */

        /*
         * int pedirNumero1;
         * int pedirNumero2;
         * 
         * if (args.length < 2) {
         * System.out.println("Dime 2 números separados por un espacio: ");
         * pedirNumero1 = sc.nextInt();
         * pedirNumero2 = sc.nextInt();
         * } else {
         * pedirNumero1 = Integer.parseInt(args[0]);
         * pedirNumero2 = Integer.parseInt(args[1]);
         * }
         * 
         * System.out.println("El número uno: " + pedirNumero1 + "\nEl segundo número: "
         * + pedirNumero2);
         */

        /*
         * if (args.length < 1) { // NO manda suficientes argumentos.
         * System.out.println("Introduce 'Día' o 'Mes' ");
         * pedirNombre = sc.nextLine();
         * 
         * } else {
         * pedirNombre = args[0]; // Cojo el argumento que está en la posición 0
         * // de la lista de argumentosde entrada y lp guardo en pedirNombre
         * }
         */
        /*
         * System.out.println("Introduce 'Día' o 'Mes' ");
         * pedirNombre = sc.nextLine();
         * 
         * if (pedirNombre.equals("Dia")) {
         * System.out.println("!!! Hoy es lunes.");
         * } else if (pedirNombre.equals("Mes")) {
         * System.out.println("!!! Estamos en enero.");
         * } else {
         * System.out.println("!!!!!!!! Mal ");
         * }
         */
        /*
         * System.out.println("Dime un número para saber que nota has sacado: ");
         * pedirNumero1 = sc.nextInt();
         * 
         * switch (pedirNumero1) {
         * case 0:
         * case 1:
         * case 2:
         * case 3:
         * case 4:
         * System.out.println("¡Insuficiente!");
         * break;
         * case 5:
         * System.out.println("¡Suficiente!");
         * break;
         * case 6:
         * System.out.println("¡Bien!");
         * break;
         * case 7:
         * case 8:
         * System.out.println("¡Notable!");
         * break;
         * case 9:
         * case 10:
         * System.out.println("¡Sobre saliente!");
         * break;
         * default:
         * System.out.println("Nota no valida!!!!");
         * break;
         * 
         * }
         */
        /*
         * System.out.println("Di un día de la semana.");
         * pedirNombre = sc.nextLine();
         * 
         * switch (pedirNombre) {
         * case "Lunes":
         * System.out.println("Es el día 1");
         * break;
         * case "Martes":
         * System.out.println("Es el día 2");
         * break;
         * case "Miercoles":
         * System.out.println("Es el día 3");
         * break;
         * case "Jueves":
         * System.out.println("Es el día 4");
         * break;
         * case "Viernes":
         * System.out.println("Es el día 5");
         * break;
         * case "Sabado":
         * System.out.println("Es el día 6");
         * break;
         * default:
         * System.out.println("Mal, otro día de la semana.");
         * break;
         * 
         * }
         */
    }
}
