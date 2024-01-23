public class MismaInicial {

    public static boolean mismaInicial(String pal1, String pal2) {
        return pal1.charAt(0) == pal2.charAt(0);
    }

    public static void main(String[] args) {
        // Crea una funcion a la que le pases 2 palabras y compruebe si tienen la misma
        // inicial. True si tiene la misma inicial, false si tiene la misma inicial.
        String palabra1 = "";
        String palabra2 = "";
        String[] palabrasDePrueba = {"patata", "pomelo", "melocoton", "1234", " "};

        if (args.length == 1 && args[0].equals("Probando")) {
            palabra1 = palabrasDePrueba[0];
            for (String palabra : palabrasDePrueba) {
                System.out.println("Empiezan las mismas letra: " + palabra1 + " y " + palabra + ": ");
                System.out.println(mismaInicial(palabra1, palabra));
            }
        } else if (args.length != 2) {
            System.out.println(" -- ¡Número de argumentos erroneo! int - String - ");
        } else {
            palabra1 = args[0];
            palabra2 = args[1];

            boolean resultado = mismaInicial(palabra1, palabra2);
            System.out.println(resultado);

            if (resultado == false) {
                System.out.println("El resultado es falso");

            } else {
                System.out.println("El resultado es verdadero");
            }
        }

    }
}
