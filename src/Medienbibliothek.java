import java.util.ArrayList;
import java.util.Objects;

public class Medienbibliothek {
    private ArrayList<Medium> medien;
    public void alleAnzeigen() {
        for(Medium m : medien) {
            m.anzeigen();
        }
    }

    public void add(Medium m) {
        Objects.requireNonNull(m);
        this.medien.add(m);
    }
}
