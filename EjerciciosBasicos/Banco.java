import java.util.Scanner;

public class Banco {

    private static double saldo = 1000.0;

    static Scanner sc = new Scanner(System.in);

    private static String input() {
        return sc.nextLine();
    }

    private static int imprimirMenu() {
        while (true) {
            try {
                System.out.println("\nIntroduce qué operación quieres realizar:");
                System.out.println("1. Sumar.");
                System.out.println("2. Restar.");
                System.out.println("3. Multiplicar.");
                System.out.println("4. Dividir.");
                System.out.println("5. Salir.");
                return Integer.parseInt(input());
            } catch (Exception e) {
                System.out.println("\nERROR: Has introducido un número mal. Inténtalo de nuevo.");
            }
        }

    }

    public static void main(String[] args) {
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

