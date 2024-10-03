import java.util.ArrayList;
import java.util.Objects;

public class Medienbibliothek {
    private ArrayList<Medium> medien;

    public Medienbibliothek() {
        this.medien = new ArrayList<Medium>();
    }

    public void alleAnzeigen() {
        for(Medium m : medien) {
            System.out.println(m.anzeigen());
        }
    }

    public void add(Medium m) {
        Objects.requireNonNull(m);
        this.medien.add(m);
    }
}
