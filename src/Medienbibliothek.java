import java.util.ArrayList;

public class Medienbibliothek {
    private ArrayList<Medium> medien;
    private void alleAnzeigen() {
        for(Medium m : medien) {
            m.anzeigen();
        }
    }
}
