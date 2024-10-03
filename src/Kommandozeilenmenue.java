import java.time.LocalDate;
import java.util.Scanner;

public class Kommandozeilenmenue {

    Scanner scan;
    private Medienbibliothek medienbibliothek;

    public Kommandozeilenmenue(Medienbibliothek medienbibliothek) {
        this.scan = new Scanner(System.in);
        this.medienbibliothek = medienbibliothek;
    }

    public void MenueAnzeigen() {
        System.out.println("MENÜ");
        System.out.println("1) ALLE MEDIEN ANZEIGEN");
        System.out.println("2) MEDIUM SUCHEN");
        System.out.println("3) exit");
    }

    public void start() {
        String s = "-";
        while (!s.equals("3")) {
            MenueAnzeigen();
            s = scan.nextLine();
            switch (s) {
                case "1":
                    this.ausgabe();
                    break;
                case "2":
                    this.suchen();
                    break;
                case "3":
                    this.add();
                    break;
                case "4":
                    break;
                default:
                    this.fehler();
                    break;
            }
        }
        scan.close();
    }

    public void ausgabe() {
        this.medienbibliothek.alleAnzeigen();
    }

    public void suchen() {
        System.out.println("Geben sie den Titel des Mediums einfach hier ein:");
        this.medienbibliothek.searchMedium(scan.nextLine());
    }

    public void add() {
        System.out.println("Geben Sie die Daten ein ");
        System.out.println("Wählen Sie den Medientyp:");
        System.out.println("1) eBook");
        System.out.println("2) Film");
        String choice = scan.nextLine();
        System.out.println("Geben Sie den Titel ein:");
        String titel = scan.nextLine();

        System.out.println("Geben Sie einen Kommentar ein:");
        String kommentar = scan.nextLine();

        System.out.println("Geben Sie das Erscheinungsdatum ein (YYYY-MM-DD):");
        LocalDate erscheinungsdatum = LocalDate.parse(scan.nextLine());

        System.out.println("Geben Sie das Genre ein:");
        String genreName = scan.nextLine();
        Genre genre = new Genre(genreName);
        switch (choice) {
            case "1":
                System.out.println("Geben Sie den Autor ein:");
                String autor = scan.nextLine();
                System.out.println("Geben Sie die ISBN ein:");
                String isbn = scan.nextLine();
                System.out.println("Geben Sie die Seitenanzahl ein:");
                int seitenanzahl = Integer.parseInt(scan.nextLine());
                System.out.println("Geben Sie die Auflage ein:");
                String auflage = scan.nextLine();
                this.medienbibliothek.add(new eBook(titel, kommentar, erscheinungsdatum, genre, autor, isbn, seitenanzahl, auflage));
                System.out.println("eBook wurde erfolgreich hinzugefügt.");
                break;

            case "2":
                System.out.println("Geben Sie den Regisseur ein:");
                String regisseur = scan.nextLine();
                System.out.println("Geben Sie die Spielzeit in Minuten ein:");
                int spielzeit = Integer.parseInt(scan.nextLine());
                System.out.println("Ist der Film in UHD verfügbar? (true/false):");
                boolean uhd = Boolean.parseBoolean(scan.nextLine());
                System.out.println("Ist der Film in HD verfügbar? (true/false):");
                boolean hd = Boolean.parseBoolean(scan.nextLine());
                this.medienbibliothek.add(new Film(titel, kommentar, erscheinungsdatum, genre, regisseur, spielzeit, uhd, hd));
                System.out.println("Film wurde erfolgreich hinzugefügt.");
                break;

            default:
                System.out.println("Ungültige Auswahl. Medium wurde nicht hinzugefügt.");
                break;
        }
    }

    public void fehler() {

    }


}
