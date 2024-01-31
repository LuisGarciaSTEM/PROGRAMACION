import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static boolean esDigito(int num) {
        return (num >= -2147483647 && num <= 2147483647);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayPalabras = new ArrayList<String>();
        int pedirNum, pedirNum2, pedirNum3;
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

        /*
         * // Del 100 al 1: Escribe los números del 100 al 1.
         * for (int i = 100; i > 0; i--) {
         * System.out.println(i);
         * }
         */

        /*
         * // Del 1 al 100 de 2 en 2: Escribe los números del 1 al 100 de dos en dos.
         * for (int i = 1; i <= 100; i += 2) {
         * System.out.println(i);
         * }
         */

        /*
         * // Del 1 a X: Solicita un número y escribe los números desde el 1 a ese
         * número.
         * System.out.println("Dime un número y escribo los números hasta ese número.");
         * pedirNum = sc.nextInt();
         * 
         * for (int i = 0; i <= pedirNum; i++) {
         * System.out.println(i);
         * }
         */

        /*
         * // De X a Y: Solicita dos números y escribe los números comprendidos entre
         * // ellos.
         * System.out.println("Dime 2 números y escribo los números entre ellos.");
         * pedirNum = sc.nextInt();
         * pedirNum2 = sc.nextInt();
         * 
         * for (int i = pedirNum; i <= pedirNum2; i++) {
         * System.out.println(i);
         * }
         */

        /*
         * // De X a Y de Z en Z: Solicita tres números, el primero va a indicar desde
         * // qué número vamos a contar, el segundo hasta qué número vamos a contar y el
         * // tercero de cuántos números en cuántos números vamos a ir saltando.
         * System.out.
         * println("Dime 3 números el primero va a indicar desde qué número vamos a contar,"
         * +
         * "el segundo hasta qué número vamos a contar y el" +
         * " tercero de cuántos números en cuántos números vamos a ir saltando.");
         * pedirNum = sc.nextInt();
         * pedirNum2 = sc.nextInt();
         * pedirNum3 = sc.nextInt();
         * 
         * for (int i = pedirNum; i <= pedirNum2; i += pedirNum3) {
         * System.out.println(i);
         * }
         */

        /*
         * // Numeros impares: Dado un número, escribe los números impares comprendidos
         * // entre el 1 y él.
         * System.out.
         * println("Dime un número, y escribo los números impares comprendidos entre el 1 y él."
         * );
         * pedirNum = sc.nextInt();
         * 
         * for (int i = 1; i <= pedirNum; i++) {
         * if (i % 2 != 0) {
         * System.out.println(i);
         * }
         * }
         */

        /*
         * // Numeros pares: Dado un número, escribe los números pares comprendidos
         * entre
         * // el 1 y el.
         * 
         * System.out.
         * println("Dime un número, y escribo los números pares comprendidos entre el 1 y él."
         * );
         * pedirNum = sc.nextInt();
         * 
         * for (int i = 1; i <= pedirNum; i++) {
         * if (i % 2 == 0) {
         * System.out.println(i);
         * }
         * }
         */

        /*
         * // Palabra de símbolos: Dado un número y un símbolo, escribir el símbolo ese
         * // número de veces.
         * 
         * System.out.println("Escribe un símbolo: ");
         * pedirFrase = sc.nextLine();
         * System.out.
         * println("Ahora escribe el número de veces que quieras que se imprima ese símbolo: "
         * );
         * pedirNum = sc.nextInt();
         * sc.nextLine();
         * for (int i = 1; i <= pedirNum; i++) {
         * System.out.println(pedirFrase);
         * }
         */

        /*
         * // Pirámide de símbolos: Dado un número y un símbolo, escribir la pirámide
         * // formada desde un símbolo hasta el número dado
         * 
         * System.out.println("Escribe un símbolo: ");
         * pedirFrase = sc.nextLine();
         * System.out.
         * println("Ahora escribe el número de veces que quieras que se imprima ese símbolo en piramide: "
         * );
         * pedirNum = sc.nextInt();
         * String lista = pedirFrase;
         * 
         * for (int i = 0; i < pedirNum; i++) {
         * System.out.println(lista);
         * lista += pedirFrase;
         * }
         */
    }
}
