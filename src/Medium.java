import java.time.LocalDate;
import java.util.Objects;

public class Medium {
    private String titel;
    private String kommentar;
    private LocalDate erscheinungsdatum;
    private Genre genre;

    public Medium(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre) {
        Objects.requireNonNull(titel);
        Objects.requireNonNull(kommentar);
        Objects.requireNonNull(erscheinungsdatum);
        Objects.requireNonNull(genre);
        this.titel = titel;
        this.kommentar = kommentar;
        this.erscheinungsdatum = erscheinungsdatum;
        this.genre = genre;
    }

    protected String anzeigen() {
        return getMediumInfo();
    }

    protected String getMediumInfo() {
        return "titel='" + titel + '\'' +
                ", kommentar='" + kommentar + '\'' +
                ", erscheinungsdatum=" + erscheinungsdatum +
                ", genre=" + genre;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public String toString() {
        return "Medium{" + getMediumInfo() + '}';
    }
}
