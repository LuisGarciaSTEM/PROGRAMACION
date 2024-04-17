import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    private static String input() {
        return sc.nextLine();
    }

    private static int pedirNum() {
        while (true) {
            try {
                System.out.println("\nDime el número de la operación.");
                int num = Integer.parseInt(input());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("\nERROR: Has introducido un número mal. Inténtalo de nuevo.");
            }
        }
    }

    private static int devolverNumMenu() {
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

    private static int suma(int num1, int num2) {
        return num1 + num2;
    }

    private static int resta(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    private static int division(int num1, int num2) {
        int devolver;
        try {
            devolver = num1 / num2;
        } catch (Exception e) {
            System.out.println("\nERROR: No se puede dividir por cero. Inténtalo de nuevo.");
            devolver = -1;
        }
        return devolver;
    }

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            switch (devolverNumMenu()) {
                case 1 -> {
                    System.out.println("\nResultado de la suma: " 
                    + suma(pedirNum(), pedirNum()));
                }

                case 2 -> {
                    System.out.println("\nResultado de la resta: " 
                    + resta(pedirNum(), pedirNum()));
                }

                case 3 -> {
                    System.out.println("\nResultado de la multiplicación: " 
                    + multiplicacion(pedirNum(), pedirNum()));
                }

                case 4 -> {
                    System.out.println("\nResultado de la división: " 
                    + division(pedirNum(), pedirNum()));
                }

                case 5 -> {
                    continuar = false;
                    System.out.println("\nSaliendo del programa...");
                }

                default -> {
                    System.out.println("\nOpción inválida, intenta nuevamente.");

                }
            }
        }
    }
}
