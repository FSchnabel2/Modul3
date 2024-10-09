import java.time.LocalDate;
import java.util.Objects;

public class eBook extends Medium{
    private String autor;
    private String ISBN;
    private int seitenanzahl;
    private String auflage;

    public eBook(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, String autor, String ISBN, int seitenanzahl, String auflage) {
        Objects.requireNonNull(titel);
        Objects.requireNonNull(kommentar);
        Objects.requireNonNull(genre);
        Objects.requireNonNull(autor);
        Objects.requireNonNull(erscheinungsdatum);
        if(seitenanzahl<=0) throw new IllegalArgumentException("Seitenanzahl muss größer als 0 sein!");
        Objects.requireNonNull(ISBN);
        Objects.requireNonNull(auflage);
        super(titel, kommentar, erscheinungsdatum, genre);
        this.autor = autor;
        this.ISBN = ISBN;
        this.seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }

    protected String anzeigen() {
        return "eBook{" +
                super.getMediumInfo() +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", seitenanzahl=" + seitenanzahl +
                ", auflage='" + auflage + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return anzeigen();
    }
}
