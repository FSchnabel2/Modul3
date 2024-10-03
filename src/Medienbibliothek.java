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

    public void searchMedium(String titel) {
        boolean found = false;
        for(Medium m : medien) {
            if(m.getTitel().equals(titel)) {
                System.out.println("Gefundenes Medium: " + m.anzeigen());
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Kein Medium mit dem Titel '" + titel + "' gefunden.");
        }
    }
}
