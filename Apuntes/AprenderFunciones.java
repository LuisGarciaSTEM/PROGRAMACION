public class AprenderFunciones {
    public static boolean numeroEsPar(int numero) {
        System.out.println("Estoy dentro de la funcion");
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = 5;
        boolean esPar;

        numeroEsPar(numero);
        for (int i = 0; i < 100; i++) {
            numero = (int) Math.floor(Math.random() * 100);
            esPar = numeroEsPar(numero);
            System.out.println("¿ " + numero + " es par?" + esPar);
        }
    }
}
