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
			switch(s)
			{
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
	
	public void ausgabe()
	{
		this.medienbibliothek.alleAnzeigen();
	}
	
	public void suchen()
	{
		System.out.println("RECHNEN 1+1 = 2");
	}
	
	public void add()
	{
		System.out.println("Sie k�nnen nur 1,2 oder 3 eingeben!");
	}


}
