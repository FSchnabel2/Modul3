import java.time.LocalDate;

public class eBook extends Medium{
    private String autor;
    private String ISBN;
    private int seitenanzahl;
    private String auflage;

    public eBook(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, String autor, String ISBN, int seitenanzahl, String auflage) {
        super(titel, kommentar, erscheinungsdatum, genre);
        this.autor = autor;
        this.ISBN = ISBN;
        seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }


}
