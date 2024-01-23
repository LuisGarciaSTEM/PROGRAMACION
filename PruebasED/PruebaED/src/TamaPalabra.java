import java.util.Scanner;

public class TamaPalabra {
    public static String tamaPalabra(int numeroLetras, String palabra) {
        // Si la palabra tiene más de ese número de letras la corta.
        // Si la palabra tiene menos de ese número de letras le añade espacios al final.
        int longitudPalabra = palabra.length();

        if (longitudPalabra < numeroLetras) {
            for (int i = longitudPalabra; i <= numeroLetras; i++) {
                palabra += "-";
            }
        } else if (longitudPalabra > numeroLetras) {
            String aux = "";
            for (int i = 0; i < numeroLetras; i++) {
                aux += palabra.charAt(i);
            }
            palabra = aux;
        }

        return palabra;
    }

    public static void main(String[] args) {
        // Tama palabra. Crea una función a la que le pases un número y una palabra.
        String[] listaPalabras = { "", "pan", "verde", "patata", "hipopotamo", "esternocleido" };
        int[] numerosPrubas = { -2, 0, 3, 5, 10 };
        int pedirNúmero = 0;
        String palabra = "";

        if (args.length == 1 && args[0].equals("probando")) {
            for (int numerosDePruebas : numerosPrubas) {
                System.out.println("Para el número: " + numerosDePruebas);
                for (String palabraPrueba : listaPalabras) {
                    System.out.println(tamaPalabra(numerosDePruebas, palabraPrueba));
                }
            }

        } else if (args.length != 2) {
            System.out.println(" -- ¡Número de argumentos erroneo! int - String - ");
        } else {
            pedirNúmero = Integer.parseInt(args[0]);
            palabra = args[1];
            System.out.println(tamaPalabra(pedirNúmero, palabra));
        }

    }
}
