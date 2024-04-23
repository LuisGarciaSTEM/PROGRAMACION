import java.util.Scanner;

public class Banco {

    private static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int imprimirMenu() {
        while (true) {
            try {
                System.out.println("\nIntroduce EL NÚMERO de la operación que quieres realizar:");
                System.out.println("1. Ingresar.");
                System.out.println("2. Sacar.");
                System.out.println("3. Ver movimientos.");
                System.out.println("4. Salir.");
                return Integer.parseInt(input());
            } catch (NumberFormatException nfe) {
                System.out.println("\nERROR: Has introducido mal el número del menú. Inténtalo de nuevo.");
            }
        }

    }

    private static double ingresar(double saldo) {
        double dineroIngresado;
        boolean salir = false;
        while (!salir) {
            try {
                System.out.println("\n¿Cuánto dinero deseas ingresar?");
                dineroIngresado = Double.parseDouble(input());
                saldo += dineroIngresado;
                salir = true;
            } catch (NumberFormatException nfe) {
                System.out.println(
                        "\nERROR: Has introducido mal la cantidad a ingresar. Inténtalo de nuevo.");
            }
        }
        return saldo;
    }

    public static double retirar(double saldo) {
        double dineroRetirar;
        boolean salir = false;
        while (!salir) {
            try {
                System.out.println("\n¿Cuánto dinero deseas retirar?");
                dineroRetirar = Double.parseDouble(input());
                if (dineroRetirar > saldo) {
                    System.out.println("Saldo insuficiente.");
                    System.out.println(
                            "No puedes retirar -> " + dineroRetirar + " cuando tienes -> " + saldo);
                } else {
                    saldo -= dineroRetirar;
                }
            } catch (NumberFormatException nfe) {
                System.out.println(
                        "\nERROR: Has introducido mal la cantidad a ingresar. Inténtalo de nuevo.");

            }
        }
        return saldo;
    }

    public static void main(String[] args) {
        double saldo = 1000.0;
        boolean salir = false;

        while (!salir) {

            System.out.println("\nTu saldo actual es -> " + saldo);

            switch (imprimirMenu()) {
                case 1 -> ingresar(saldo);

                case 2 -> retirar(saldo);

                case 3 -> System.out.println("Tu saldo actual es: " + saldo);

                case 4 -> {
                    System.out.println("Saliendo del programa.");
                    System.out.println("Que pase un hemoso día");
                    salir = true;
                }

                default -> System.out.println("Has introducido una opción inválida.");
            }

        }
    }
}
