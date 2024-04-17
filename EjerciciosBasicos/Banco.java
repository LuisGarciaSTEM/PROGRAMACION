import java.util.Scanner;

public class Banco {

    private static double saldo = 1000.0;

    private static void imprimirMenu() {
        System.out.println("1. Ingresar dinero.");
        System.out.println("2. Retirar dinero.");
        System.out.println("3. Mostrar dinero actual.");
        System.out.println("4. Salir.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tu saldo es: " + saldo);
        boolean salir = false;
        double dineroIngresado;

        while (!salir) {
            imprimirMenu();
            int opcion = 0;
            try {
                System.out.println("¿Qué quieres hacer con tu dinero: ?");
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número.");
                sc.nextLine(); // Limpiar el buffer de entrada
            }

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuánto dinero deseas ingresar?");
                    dineroIngresado = sc.nextDouble();
                    saldo += dineroIngresado;
                    break;
                case 2:
                    System.out.println("¿Cuánto dinero deseas retirar?");
                    double dineroRetirar = sc.nextDouble();
                    if (dineroRetirar > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= dineroRetirar;
                    }
                    break;
                case 3:
                    System.out.println("Tu saldo actual es: " + saldo);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Has introducido una opción inválida.");
            }

        }
    }
}

