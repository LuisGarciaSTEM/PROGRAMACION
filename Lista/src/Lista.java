import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    private ArrayList<Integer> listaNumeros;

    public Lista() {
        listaNumeros = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getListaNumeros() {
        return this.listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = (ArrayList<Integer>) listaNumeros.clone();
    }

    /**
     * Añade un número a la lista de números.
     * 
     * @param numero Número que se quiere añadir a la lista.
     */
    public void aniadirNumeroALista(int numero) {
        listaNumeros.add(numero);
    }

    /**
     * Busca un número en la lista de números.
     * 
     * @param numero Número que se quiere buscar.
     * @return La posición en la que se ha encontrado el número. Si no se ha
     *         encontrado devuelve -1.
     */
    public int buscarNumeroEnLista(int numero) {
        return listaNumeros.indexOf(numero);
    }

    /**
     * Elimina un número de la lista de números.
     * 
     * @param numero Número que quiere eliminar.
     * @return Si se ha eliminado (true) o no (false).
     */
    public boolean eliminarNumeroDeLista(int numero) {
        return true;
    }

    /**
     * Elimina el elemento que se encuentra en la posición dada.
     * 
     * @param posicion Número de la posición que se quiere eliminar.
     * @return Si se ha eliminado (true) o no (false).
     */
    public boolean eliminarPosicion(int posicion) {
        return true;
    }

    public String toString() {
        return listaNumeros.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista miLista = new Lista();
        miLista.aniadirNumeroALista(10);
        miLista.aniadirNumeroALista(5);
        miLista.aniadirNumeroALista(15);

        System.out.println("Mi lista es " + miLista);

        System.out.println("Dime el número que quieres buscar: ");
        int numeroABuscar = sc.nextInt();
        numeroABuscar = miLista.buscarNumeroEnLista(numeroABuscar);

        if (numeroABuscar != -1) {
            System.out.println(numeroABuscar + " encontrado en la posición: " + numeroABuscar);
        } else {
            System.out.println(numeroABuscar + " no encontrado en la lista");
        }
    }
}
