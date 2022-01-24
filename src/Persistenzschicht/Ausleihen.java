package Persistenzschicht;

public class Ausleihen {

	private String rückgabe;


	/**
	 * 
	 * @param passwort
	 */
	public void ausleihenBestätigen(String passwort) {
		// TODO - implement Persistenzschicht.Ausleihen.ausleihenBestätigen
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nutzerID
	 * @param buchID
	 */
	public long ausleihIDerstellen(long nutzerID, long buchID) {
		long ausleihID = nutzerID + buchID; //summe beider IDs
		return ausleihID;
	}

	/**
	 * 
	 * @param ausleihID
	 * @param Datum
	 */
	public void checkRückgabe(long ausleihID, String Datum) {
		// TODO - implement Persistenzschicht.Ausleihen.checkRückgabe
		throw new UnsupportedOperationException();
	}

}