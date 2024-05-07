import java.time.LocalDate;
import Restaurante.Restaurante;

public class App {
    public static void main(String[] args) {
        System.out.println(3);

        // Create 1 restaurant and 4 reservations, 2 for tomorrow and 2 for the day after tomorrow.
        Restaurante miRestaurante = new Restaurante("Quijote", 30);

        LocalDate hoy = LocalDate.now();
        LocalDate mañana = hoy.plusDays(1);
        LocalDate pasadoMañana = hoy.plusDays(2);

        miRestaurante.resevar("Maria", mañana, 4);
        miRestaurante.resevar("Juan", mañana, 2);
        miRestaurante.resevar("Luis", pasadoMañana, 3);
        miRestaurante.resevar("Ana", pasadoMañana, 2);

        System.out.println(miRestaurante);
    }
}
