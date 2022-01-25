package Persistenzschicht;

public class AusleihbaresMedium<kategorie>{

	private String titel;
	private String autor;
	private long ISBN;
	private boolean verfügbarkeit;
	private int exemplare;
	private long mediumID;
	private boolean reserviert;
	private  kategorie kategorie;

	public AusleihbaresMedium(String titel, String autor, long ISBN) {
		this.titel = titel;
		this.autor = autor;
		this.ISBN = ISBN;
		this.verfügbarkeit = true;
		this.mediumID = newID();
		this.reserviert = false;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}

	public boolean isVerfügbarkeit() {
		return verfügbarkeit;
	}

	public void setVerfügbarkeit(boolean verfügbarkeit) {
		this.verfügbarkeit = verfügbarkeit;
	}

	public int getExemplare() {
		return exemplare;
	}

	public void setExemplare(int exemplare) {
		this.exemplare = exemplare;
	}

	public long getMediumID() {
		return mediumID;
	}

	public void setMediumID(long mediumID) {
		this.mediumID = mediumID;
	}

	public boolean isReserviert() {
		return reserviert;
	}

	public void setReserviert(boolean reserviert) {
		this.reserviert = reserviert;
	}

	public kategorie getKategorie() {
		return kategorie;
	}

	public void setKategorie(kategorie kategorie) {
		this.kategorie = kategorie;
	}

	public Ausleihen ausleihen(long kontoID) {
		Ausleihen ausleihe = new Ausleihen(AusleihkontoEK.getAusleihkonto(kontoID),this);
		this.setVerfügbarkeit(false);
		return ausleihe.getAusleihe();
	}

	/**
	 * 
	 * @param mediumID
	 * @param AGB
	 * @param nutzerID
	 */
	public void vorbestellung(long mediumID, boolean AGB, int nutzerID) {
		// TODO - implement Persistenzschicht.AusleihbaresMedium.vorbestellung
		throw new UnsupportedOperationException();
	}

}