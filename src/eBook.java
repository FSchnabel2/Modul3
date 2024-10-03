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
        this.seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }

    protected String anzeigen() {
        return super.anzeigen() + " " + this.toString();
    }

    @Override
    public String toString() {
        return "eBook{" +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", seitenanzahl=" + seitenanzahl +
                ", auflage='" + auflage + '\'' +
                '}';
    }
}
