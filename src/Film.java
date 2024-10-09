import java.time.LocalDate;
import java.util.Objects;

public class Film extends Medium {

    private String regisseur;
    private int spielzeit;
    private boolean uhd;
    private boolean hd;

    public Film(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, String regisseur, int spielzeit, boolean uhd, boolean hd) {
        Objects.requireNonNull(titel);
        Objects.requireNonNull(kommentar);
        Objects.requireNonNull(genre);
        Objects.requireNonNull(regisseur);
        Objects.requireNonNull(erscheinungsdatum);
        if(spielzeit<=0) throw new IllegalArgumentException("Spielzeit muss größer als 0 sein!");
        Objects.requireNonNull(uhd);
        Objects.requireNonNull(hd);
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
