import java.util.ArrayList;
import java.util.Scanner;

public interface EjerciciosListas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lista en código Crea una lista de 5 palabras directamente en el código.
        ArrayList<String> lista5Palabras = new ArrayList<String>();

        lista5Palabras.add("Palabra 1");
        lista5Palabras.add("Palabra 2");
        lista5Palabras.add("Palabra 3");
        lista5Palabras.add("Palabra 4");
        lista5Palabras.add("Palabra 5");

        System.out.println(lista5Palabras);



    }
}
