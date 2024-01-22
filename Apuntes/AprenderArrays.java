public class AprenderArrays {

    public static void imprimirArray(String[] lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        // ARRAYs ESTATICAS (LISTA).
        // Creación de arrays estáticas.
        String[] colores = { "Azul", "Amarilllo", "Rojo", "Verde", "Morado", "Marron" };
        System.out.println(colores); // Para mostrarlas por pantalla saliendo los datos
                                     // y no la direccion tendríamos que hacer un bucle.

        int[] numeros;
        numeros = new int[10]; // Array vacio con 10 huecos. Declarar y luego crear.
        char[] letras = new char[10]; // Lo creamos durante la declaración.

        String[] colores2 = colores;
        System.out.println(colores2);

        colores[1] = "4m4r1ll0";

        System.out.println("Imprimo colores: ");
        imprimirArray(colores);
        System.out.println("Imprimo colores 2: ");
        imprimirArray(colores2);

        // ARRAYs DINAMICAS (LISTA)
        // Creación de arrays estáticas.

    }
}
