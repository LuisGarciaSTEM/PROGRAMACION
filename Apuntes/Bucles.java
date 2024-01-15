public class Bucles {
    public static void main(String[] args) {

        // For each -> for color in listaColores

        String[] listaAzules = { "Azul", "Añil", "Indigo", "Cobalto", "Klein" };
        for (String azul : listaAzules) {
            System.out.println(azul);

        }

        // For -> NO existe en Python...
        // for (incializmos variables; condicion while; de cuánto en cuánto van
        // aumentando)
        for (int contador = 0; contador < 10 + 1; contador++) {
            System.out.println(contador);
        }

        // i de Iterador
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("" + i + j + " ");
            }
            System.out.println();
        }

        

    }
}
