import java.util.Scanner;

public class App {

    public static boolean esDigito(int num) {
        return (num >= -2147483647 && num <= 2147483647);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pedirNum; 
        String pedirFrase;
        // Dígito: Solicita un dígito, si dato introducido no es un dígito, vuelve a
        // solicitar un dígito.
        
        /* 
        do {
            System.out.println("Dime un número: ");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingresa un número entero.");
                sc.next(); // Consumir el input no válido
            }

            // Asignar el valor ingresado por el usuario a la variable pedirNum
            pedirNum = sc.nextInt();

        } while (!esDigito(pedirNum));

        System.out.println("Has introducido un número: " + pedirNum);
        */

        /*
        // Eco: Solicita palabras por teclado y repitelas hasta que el usuario escriba
        // SALIR.
        do {
            System.out.println("Dime la contraseña correcta: ");
            pedirFrase = sc.nextLine();
        } while (!pedirFrase.toLowerCase().equals("salir"));

        System.out.println("Correcto has adivinado la contraseña."); 
        */

        
    }
}
