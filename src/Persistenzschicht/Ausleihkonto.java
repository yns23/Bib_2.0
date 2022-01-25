package Persistenzschicht;

import java.io.InputStream;
import java.util.ArrayList;

import static Persistenzschicht.AusleihkontoEK.newID;

public class Ausleihkonto{

	private String benutzername;
	private String passwort;
	private long id;
	private Fakultät fakultet;
	private ArrayList<AusleihbaresMedium> ausgelieheneMedien;
	private ArrayList<AusleihbaresMedium> reservierteMedien;
	private ArrayList<Mahungen> mahnungen;

	public Ausleihkonto(String bn,String passwort,Fakultät fakultet) {
		long id = generateID();
		this.benutzername = bn;
		this.passwort = passwort;
		this.id = id;
		this.fakultet = fakultet;
		this.ausgelieheneMedien = new ArrayList<Ausleihen>();
		this.reservierteMedien = new ArrayList<AusleihbaresMedium>();
		this.mahnungen = new ArrayList<Mahungen>();
	}

	public String getPasswort() {
		return passwort;
	}
	public String getBenutzername() {
		return benutzername;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public Fakultät getfakultet() {
		return fakultet;
	}
	public void setfakultet(Fakultät fakultet) {
		this.fakultet = fakultet;
	}

	public int anzahlAusleihen(){
		return ausgelieheneMedien.size();
	}
	public void addAusleihe(AusleihbaresMedium m){
		this.ausgelieheneMedien.add(m);
		System.out.println(" Das Medium "+m.getTitel()+" wurde erfolgreich ausgeliehen!");
	}
	public AusleihbaresMedium getAusgeliehenesMedium(int a){
		return ausgelieheneMedien.get(a);
	}
	public ArrayList<AusleihbaresMedium> getAusgelieheneMedien() {
		return ausgelieheneMedien;
	}
	public void entferneAusleihe(AusleihbaresMedium m){
		ausgelieheneMedien.remove(m);
	}

	public int anzahlReservierungen(){return reservierteMedien.size();}
	public void addReservierung(AusleihbaresMedium m){
		this.reservierteMedien.add(m);
		System.out.println(" Das Medium "+m.getTitel()+" wurde erfolgreich reserviert!");
	}
	public AusleihbaresMedium getReserviertesMedium(int a){
		return reservierteMedien.get(a);
	}
	public ArrayList<AusleihbaresMedium> getReservierteMedien() {
		return reservierteMedien;
	}
	public void entferneReservierung(AusleihbaresMedium m){
		reservierteMedien.remove(m);
	}

	public int anzahlMahnungen(){
		return mahnungen.size();
	}
	public void addMahnung(Mahungen m){
		this.mahnungen.add(m);
		System.out.println(" Sie haben eine neue Mahnung erhalten. Bitte Melden Sie sich bei einem Sachbearbeiter.");
	}
	public Mahungen getMahnung(int a) {
		return mahnungen.get(a);
	}
	public ArrayList<Mahungen> getMahnungen(){
		return mahnungen;
	}
	public void entferneMahnung(Mahungen m){
		ausgelieheneMedien.remove(m);
	}


	public void zugriffBibliothek() {
		System.out.println("1-TitelSuche, 2-AutorSuche, 3-ISBNsuche");
		//Scanner e = new Scanner(InputStream.nullInputStream());

		throw new UnsupportedOperationException();
	}

	public void mahnungenAnsehen() {
		// TODO - implement Persistenzschicht.Ausleihkonto.mahnungenAnsehen
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Mahnungen
	 */
	public void kontoLöschen(int Mahnungen) {
		// TODO - implement Persistenzschicht.Ausleihkonto.kontoLöschen
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Dauer
	 * @param checkReservierung
	 */
	public void verlängerung(int Dauer, boolean checkReservierung) {
		// TODO - implement Persistenzschicht.Ausleihkonto.verlängerung
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ausleihID
	 */
	public void verlustmedlung(long ausleihID) {
		// TODO - implement Persistenzschicht.Ausleihkonto.verlustmedlung
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ausleihID
	 * @param schaden
	 */
	public void schadenMeldung(long ausleihID, String schaden) {
		// TODO - implement Persistenzschicht.Ausleihkonto.schadenMeldung
		throw new UnsupportedOperationException();
	}


	/**
	 * 
	 * @param Anliegen
	 */
	public void support(String Anliegen) {
		// TODO - implement Persistenzschicht.Ausleihkonto.support
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Passwort
	 */
	public void benutzerkontoLöschen(String Passwort) {
		// TODO - implement Persistenzschicht.Ausleihkonto.benutzerkontoLöschen
		throw new UnsupportedOperationException();
	}
}