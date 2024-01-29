import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Solicita 10 circulos y los metes en un ArrayList de Circulos.
        // Muestra por pantalla los Circulos introducidos.
        Scanner sc = new Scanner(System.in);
        ArrayList<Circulo> listaCirculos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Dime color y radio del circulo: " + (i + 1));

            String colorCirculo = sc.next();
            int radioCirculo = sc.nextInt();

            Circulo nuevoCirculo = new Circulo(radioCirculo, colorCirculo);

            listaCirculos.add(nuevoCirculo);
        }

        for (Circulo circulo : listaCirculos) {
            System.out.println(circulo);
        }
    }
}
