import java.util.ArrayList;
import java.util.Scanner;

public interface EjerciciosListas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lista en código Crea una lista de 5 palabras directamente en el código.
        /*
         * ArrayList<String> lista5Palabras = new ArrayList<String>();
         * 
         * lista5Palabras.add("Palabra 1");
         * lista5Palabras.add("Palabra 2");
         * lista5Palabras.add("Palabra 3");
         * lista5Palabras.add("Palabra 4");
         * lista5Palabras.add("Palabra 5");
         * 
         * System.out.println(lista5Palabras);
         */

        // Lista con Scanner Crea una lista de 5 palabras, solicitándolas por consola.
        /*
         * ArrayList<String> lista5PalabrasPorConsola = new ArrayList<>();
         * System.out.println("Dime 5 palabras para añadir a la lista: ");
         * 
         * for (int i = 1; i < 6; i++) {
         * System.out.print(i + ": ");
         * String pedirPalabras = sc.nextLine();
         * lista5PalabrasPorConsola.add(pedirPalabras);
         * }
         * 
         * System.out.println(lista5PalabrasPorConsola);
         */

        // Lista con argumentos Crea una lista de 5 palabras, pasándolas como
        // argumentos.
        /*
         * if (args.length == 5) {
         * ArrayList<String> lista5PalabrasPorArgumento = new ArrayList<>();
         * 
         * for (int i = 0; i < args.length; i++) {
         * System.out.println((i + 1) + ": " + args[i]);
         * lista5PalabrasPorArgumento.add(args[i]);
         * }
         * 
         * System.out.println("Contenido de la lista: " + lista5PalabrasPorArgumento);
         * } else {
         * System.out.
         * println("La cantidad de argumentos introducida no es valida. SON 5.");
         * }
         * 
         * // System.out.println("Número real de argumentos: " + args.length);
         */

        // Lista en código de tamaño n Crea una lista de N palabras directamente en el
        // código. Para saber el valor de N puede ser introducido por parámetros o
        // solicitado mediante Scanner por la terminal.

        

    }
}
