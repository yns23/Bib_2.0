package Persistenzschicht;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class Bibliothekbestand {

	private ArrayList<Buch> Datenbank;
	private int anzahlAusleihbareMedien;
	private List inventar;

	protected Bibliothekbestand(){
		Datenbank = new ArrayList<Buch>();
		System.out.println("Bibliotheksdatenbank wurde erstellt.");

	}

	public Buch TitelSuche(String titel) throws Exception {

		for (Buch buch : this.Datenbank) {
			if (titel.equals(buch.getTitel()))
				return buch;

		}
		 throw new Exception("Persistenzschicht.Buch wurde nicht gefunden.");

	}


	public Buch AutorSuche(String vorname, String nachname) {
		for (Buch buch : Datenbank) {
			if (vorname + " " + nachname == buch.getAutor())
				return buch;
		}
		throw new UnsupportedOperationException();
	}

	public Buch ISBNsuche(long ISBN) {
		for (Buch buch : Datenbank) {
			if (ISBN == buch.getISBN())
				return buch;
		}
		throw new UnsupportedOperationException();
	}


	public void BuchHinzufügen(Buch neu) {

		this.Datenbank.add(neu);
		System.out.println("Das Buch mit der ID [" + neu.getMediumID() + "] und dem Titel [" +neu.getTitel()+ "] wurde erfoglreich zur Bibliothek aufgenommen!");

	}

	public void WunschAntrag() {
		System.out.println("Wunsch wurde erfolgreich übermittelt.");
	}

	public boolean isEmpty() {
		return Datenbank.isEmpty();
	}

	public ArrayList<Buch> returnList(){
		return Datenbank;
	}
}