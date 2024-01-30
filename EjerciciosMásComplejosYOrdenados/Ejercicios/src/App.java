import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static boolean esDigito(int num) {
        return (num >= -2147483647 && num <= 2147483647);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayPalabras = new ArrayList<String>();
        int pedirNum;
        String pedirFrase, palabraSeparada, palabra;
        // Dígito: Solicita un dígito, si dato introducido no es un dígito, vuelve a
        // solicitar un dígito.

        /*
         * do {
         * System.out.println("Dime un número: ");
         * while (!sc.hasNextInt()) {
         * System.out.println("Por favor, ingresa un número entero.");
         * sc.next(); // Consumir el input no válido
         * }
         * 
         * // Asignar el valor ingresado por el usuario a la variable pedirNum
         * pedirNum = sc.nextInt();
         * 
         * } while (!esDigito(pedirNum));
         * 
         * System.out.println("Has introducido un número: " + pedirNum);
         */

        /*
         * // Eco: Solicita palabras por teclado y repitelas hasta que el usuario
         * escriba SALIR.
         * 
         * System.out.println("Introduce palabras hasta salir: ");
         * palabra = sc.nextLine();
         * 
         * while(!palabra.toLowerCase().equals("salir")){
         * arrayPalabras.add(palabra);
         * System.out.println("Introduce palabras hasta salir: ");
         * System.out.println(arrayPalabras);
         * palabra = sc.nextLine();
         * }
         * 
         * System.out.println("Has construido la lista: " + arrayPalabras);
         */

        /*
         * // Eco con -: Solicita palabras por teclado y repitelas separando cada una de
         * // las letras con giones hasta que el usuario escriba SALIR.
         * 
         * System.out.println("Introduce palabras hasta salir: ");
         * palabra = sc.nextLine();
         * 
         * while (!palabra.toLowerCase().equals("salir")) {
         * arrayPalabras.add(palabra);
         * System.out.println("Introduce palabras hasta salir: ");
         * System.out.println(arrayPalabras);
         * for (String letra : arrayPalabras) {
         * System.out.println(letra + "-");
         * }
         * palabra = sc.nextLine();
         * }
         * 
         * System.out.println("Has construido la lista: " + arrayPalabras);
         */

        /*
         * // Eco 10 veces: Solicita una palabra y que el programa la repita 10 veces.
         * 
         * System.out.println("Dime una palabra/frase para repetirla 10 veces. ");
         * pedirFrase = sc.nextLine();
         * for (int i = 0; i < 10; i++) {
         * System.out.println(pedirFrase);
         * }
         */

        /*
         * // Eco X veces: Solicita una palabra y un número y que el programa repita la
         * // palabra ese número de veces.
         * System.out.println("Dime una palabra/frase.");
         * pedirFrase = sc.nextLine();
         * System.out.println("Ahora dime cuantas veces quieres que se repita eso: ");
         * pedirNum = sc.nextInt();
         * 
         * for (int i = 0; i < pedirNum; i++) {
         * System.out.println(pedirFrase);
         * }
         */

        /*
         * // Del 1 al 100: Escribe los números del 1 al 100.
         * for (int i = 0; i <= 100; i++) {
         * System.out.println(i);
         * }
         */

        // Del 100 al 1: Escribe los números del 100 al 1.
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }

    }
}
