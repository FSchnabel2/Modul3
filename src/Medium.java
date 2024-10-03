import java.time.LocalDate;

public class Medium {
    private String titel;
    private String kommentar;
    private LocalDate erscheinungsdatum;
    private Genre genre;

    public Medium(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre) {
        this.titel = titel;
        this.kommentar = kommentar;
        this.erscheinungsdatum = erscheinungsdatum;
        this.genre = genre;
    }

    protected void anzeigen() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Medium{" +
                "titel='" + titel + '\'' +
                ", kommentar='" + kommentar + '\'' +
                ", erscheinungsdatm=" + erscheinungsdatum +
                ", genre=" + genre +
                '}';
    }
}