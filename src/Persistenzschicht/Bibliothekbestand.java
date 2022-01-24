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

		for (int i = 0; i < this.Datenbank.size(); i++) {
			if (titel.equals(this.Datenbank.get(i).getTitel()))
				return this.Datenbank.get(i);

		}
		 throw new Exception("Persistenzschicht.Buch wurde nicht gefunden.");

	}


	public Buch AutorSuche(String vorname, String nachname) {
		for (int i = 0; i < Datenbank.size(); i++) {
			if (vorname +" "+nachname == Datenbank.get(i).getAutor())
				return Datenbank.get(i);
		}
		throw new UnsupportedOperationException();
	}

	public Buch ISBNsuche(long ISBN) {
		for (int i = 0; i < Datenbank.size(); i++) {
			if (ISBN == Datenbank.get(i).getISBN())
				return Datenbank.get(i);
		}
		throw new UnsupportedOperationException();
	}


	public void BuchHinzufügen(Buch neu, long adminID) {

		this.Datenbank.add(neu);
		System.out.println("Das Persistenzschicht.Buch mit der ID = " + neu.getMediumID() + " wurde erfoglreich zur Bibliothek aufgenommen!");

	}

	public void WunschAntrag() {
		System.out.println("Wunsch wurde erfolgreich übermittelt.");
	}

	public boolean isEmpty() {
		return Datenbank.isEmpty();
	}
}