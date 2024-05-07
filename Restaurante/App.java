import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Crear un restaurante con 4 reservas
        Restaurante miRestaurante = new Restaurante("Quijote", 30);

        LocalDate hoy = LocalDate.now();
        LocalDate mañana = hoy.plusDays(1);
        LocalDate pasadoMañana = hoy.plusDays(2);

        miRestaurante.resevar("Maria", mañana, 5);
        miRestaurante.resevar("Juan", mañana, 8);
        miRestaurante.resevar("Luis", pasadoMañana, 15);
        miRestaurante.resevar("Ana", pasadoMañana, 10);

        System.out.println(miRestaurante);

        boolean reservado = miRestaurante.resevar("hola", pasadoMañana, 7);
        if (reservado) System.out.println("La reserva se ha realizado correctamente.");
        else System.out.println("La reserva NO se ha podido realizar.");

        System.out.println(miRestaurante);

    }
}
