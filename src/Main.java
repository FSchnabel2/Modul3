import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Medienbibliothek medienbibliothek = new Medienbibliothek();
        eBook eBook = new eBook("Buch1", "Kommentar1", LocalDate.of(2023,8,11), new Genre("Krimi"), "Autor1", "1234BN", 152, "V1.2");
        medienbibliothek.add(eBook);
        medienbibliothek.alleAnzeigen();
        System.out.println();
        Film film = new Film("Film1", "Kommentar2", LocalDate.of(2024,5,1), new Genre("Action"), "Regisseur1", 123, true, false);
        medienbibliothek.add(film);
        medienbibliothek.alleAnzeigen();
        System.out.println();

        medienbibliothek.searchMedium("Buch1");

        Kommandozeilenmenue kommandozeilenmenue = new Kommandozeilenmenue(new Medienbibliothek());
        kommandozeilenmenue.start();

    }
}