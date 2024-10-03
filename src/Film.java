import java.time.LocalDate;

public class Film extends Medium {

    private String regisseur;
    private int spielzeit;
    private boolean uhd;
    private boolean hd;

    public Film(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, String regisseur, int spielzeit, boolean uhd, boolean hd) {
        super(titel, kommentar, erscheinungsdatum, genre);
        this.regisseur = regisseur;
        this.spielzeit = spielzeit;
        this.uhd = uhd;
        this.hd = hd;
    }

    protected String anzeigen() {
        return super.anzeigen() + " " + this.toString();
    }

    @Override
    public String toString() {
        return "Film{" +
                "regisseur='" + regisseur + '\'' +
                ", spielzeit=" + spielzeit +
                ", uhd=" + uhd +
                ", hd=" + hd +
                '}';
    }
}
