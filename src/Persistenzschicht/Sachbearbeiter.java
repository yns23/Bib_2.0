package Persistenzschicht;

import java.util.Scanner;

public class Sachbearbeiter {

	private long adminID;
	private int berechtigung;

	public Sachbearbeiter(long adminID, int berechtigung) {
		this.adminID = adminID;
		this.berechtigung = berechtigung;
	}


	public void nutzerErstellen() throws Exception {
		System.out.println("Neuen Persistenzschicht.Nutzer erstellen...");
		System.out.println("Bitte geben Sie einen Namen ein: ");
		Scanner name = new Scanner(System.in);
		System.out.println("Welche Rolle hat der Persistenzschicht.Nutzer?: ");
		Scanner rolle = new Scanner(System.in);
		System.out.println("Wie ist der Status?: ");
		Scanner status = new Scanner(System.in);
		System.out.println("Ist der Persistenzschicht.Nutzer volljährig Y/N ?");
		Scanner check18 = new Scanner(System.in);
		String vcheck = check18.toString();

		if (vcheck.equals("N")){
			throw new Exception("Es werden nur volljäöhrige Persistenzschicht.Nutzer akzeptiert.");
		}

		if (vcheck.equals("Y")){
			System.out.println("Persistenzschicht.Nutzer erstellt");
		}

		else throw new Exception("Ungültige Eingabe");
		throw new UnsupportedOperationException();
	}

	public void bibliothekSuche() {
		// TODO - implement Persistenzschicht.Sachbearbeiter.bibliothekSuche
		throw new UnsupportedOperationException();
	}

	public void bibliothekBearbeiten() {
		// TODO - implement Persistenzschicht.Sachbearbeiter.bibliothekBearbeiten
		throw new UnsupportedOperationException();
	}

}