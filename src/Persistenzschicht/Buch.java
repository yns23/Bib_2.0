package Persistenzschicht;

public class Buch extends AusleihbaresMedium {

	private String titel;
	private String autor;
	private boolean verfügbarkeit;
	private boolean reserviert;
	private int exemplare;
	private long ISBN;

	public Buch(String titel, String autor, long ISBN, int exemplare, long mediumID) {
		super(titel, autor, ISBN, true, exemplare, mediumID, false);
		this.titel = titel;
		this.autor = autor;
		this.ISBN = ISBN;
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

	public void addExemplare(){
		this.exemplare++;
	}
	public void removeExemplare(){
		this.exemplare--;
	}

	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}

	public boolean isReserviert() {
		return reserviert;
	}
	public void setReserviert(boolean reserviert) {
		this.reserviert = reserviert;
	}
}