import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Medienbibliothek medienbibliothek = new Medienbibliothek();
        eBook eBook = new eBook("Buch1", "Kommentar1", LocalDate.of(2023,8,11), new Genre("Krimi"), "Autor1", "1234BN", 152, "V1.2");
        medienbibliothek.add(eBook);
        medienbibliothek.alleAnzeigen();
    }
}