import java.lang.reflect.Array;
import java.util.ArrayList; 

public class AprenderArrays {
    // Sobrecarga de funciones: podemos tener funciones con el mismo nombre y
    // funcionalidad siemrpre y cuando los atributos de entrada sean distintos. Para
    // poder cambiar los tipos de datos, pero mantener la funcionalidad
    public static void imprimirArray(String[] lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void imprimirArray(int[] lista) {
        for (int elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void imprimirArray(char[] lista) {
        for (char elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        // ARRAYs ESTATICAS (LISTA).
        // Creación de arrays estáticas.
        String[] colores = { "Azul", "Amarilllo", "Rojo", "Verde", "Morado", "Marron" };
        String color;
        System.out.println(colores); // Para mostrarlas por pantalla saliendo los datos
                                     // y no la direccion tendríamos que hacer un bucle.

        int[] numeros;
        numeros = new int[10]; // Array vacio con 10 huecos. Declarar y luego crear.
        char[] letras = new char[10]; // Lo creamos durante la declaración.

        String[] colores2 = colores; // Si modificamos colores se modifica tambien colores
                                     // 2 porque estamos haciendo una copia superficial =
                                     // solo del puntero que apunta a la lista de colores
        System.out.println(colores2);
        // Imprime las 2 listas iguales.
        System.out.println("Imprimo colores: ");
        imprimirArray(colores);
        System.out.println("Imprimo colores 2: ");
        imprimirArray(colores2);

        // Cambiamos lo que hay en la posicion [1]
        colores[1] = "4m4r1ll0";
        System.out.println("\nImprimo colores modificado: ");
        imprimirArray(colores);
        System.out.println("Imprimo colores2 modificado: ");
        imprimirArray(colores2);

        // Para sacar el valor de una posicion.
        color = colores[0];
        System.out.println("El color en la primera posición es: " + color);

        System.out.println("Imprimo números: ");
        imprimirArray(numeros); // Por defecto, son 0s.

        System.out.println("Imprimo letras: ");
        imprimirArray(letras); // Por defencto son espacios en blanco.

        // ARRAYs DINAMICAS (LISTA)
        // Creación de arrays estáticas.
        ArrayList<String> arrayColores = new ArrayList<String>();
        ArrayList<String> arrayColores2 = arrayColores;
        arrayColores.add("Azul");
        arrayColores.add("Amarrilo");
        arrayColores.add("Rojo");
        arrayColores.add("Verde");
        arrayColores.add("Blanco");

        System.out.println("Imprimo el arrayList de colores: ");
        System.out.println(arrayColores);

        System.out.println("Imprimo arryList de Colores2:" );
        System.out.println(arrayColores2);

        // Mostrar o recoger un valor del arraList:
        color = arrayColores.get(0);
        System.out.println("El color de la posicion 0 = " + color);
        

    }
}
