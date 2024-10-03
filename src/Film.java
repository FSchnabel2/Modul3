import java.time.LocalDate;

public class Film extends Medium {

    public Film(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre) {
        super(titel, kommentar, erscheinungsdatum, genre);
    }
}
