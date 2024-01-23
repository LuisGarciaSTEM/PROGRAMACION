package Ejercicios;

public class PiramideDeSimbolos {

    public static void main(String[] args) {
        // Dado un número y un símbolo, escribir la piramide hacia abajo formada desde
        // un símbolo hasta el número dado.
        int num = 0;
        String simbolo;

        if (args.length != 2) {
            System.out.println(" -- ¡Número de argumentos erroneo! int - String - ");
        } else {
            num = Integer.parseInt(args[0]);
            simbolo = args[1];

            for (int i = 0; i <= num; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(simbolo);
                }

                System.out.println();

            }

        }

    }
}
