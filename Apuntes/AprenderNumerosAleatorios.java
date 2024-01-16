import java.util.Random;

public class AprenderNumerosAleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int numero;

        numero = rand.nextInt();
        System.out.println("Todos los números: " + numero);

        // Número entre 0 y 4
        numero = rand.nextInt(5);
        System.out.println("Todos números hasta 5: " + numero);

        // Número entre 0 y 5
        numero = rand.nextInt(5 + 1);
        System.out.println("Todos números hasta 5: " + numero);

        // Número entre 1 y 5
        numero = rand.nextInt(5) + 1;
        System.out.println("Todos números hasta 5: " + numero);
    }
}
