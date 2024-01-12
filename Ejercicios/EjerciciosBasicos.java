package Ejercicios;

public class EjerciciosBasicos {
    public static void main(String[] args) {
        int min = 0, max = 100, numero;
        if (args.length != 3) {
            System.out.println("No has introducido el número necesarios de argumentos necesarios.");
            System.out.println(
                    "Necesitamos 3 enteros: El valor mínimo, el máximo, y el que queremos comprobar si está entre los 2.");
        } else {
            min = Integer.parseInt(args[0]);
            max = Integer.parseInt(args[1]);
            numero = Integer.parseInt(args[2]);

            if (numero >= min && numero <= max) {
                System.out.println("El número " + numero + " está comprendido dentro de " + min + " y " + max);
            } else {
                System.out.println("El número " + numero + " NOO está comprendido dentro de " + min + " y " + max);
            }
        } 
    }
}
