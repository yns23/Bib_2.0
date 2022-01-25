package Persistenzschicht;

import Persistenzschicht.AusleihbaresMedium;
import Persistenzschicht.Ausleihkonto;
import Persistenzschicht.Mahungen;

public class Ausleihen {

	private long ausleihID;
	private AusleihbaresMedium objekt;
	private int ausleihzeit;
	private int verlaengerungen;

	public Ausleihen(Ausleihkonto Nutzer,AusleihbaresMedium Medium){
		ausleihID = (Nutzer.getId()+Medium.getMediumID());
		this.ausleihzeit = 30;
		this.verlaengerungen = 3;
		this.objekt = Medium;
		Nutzer.addAusleihe(this);
	}

	public Ausleihen getAusleihe(){
		return this;
	}


	public long getAusleihID(){
		return ausleihID;
	}

	public AusleihbaresMedium getObjekt(){return objekt;}

	public int getAusleihzeit(){

		return ausleihzeit;
	}

	public int getVerlaengerungen(){return verlaengerungen;}

	public void Verlängern(){
		if(verlaengerungen == 0){
			System.out.println("Nur 3 Verlängerungen pro Ausleihe!");
		}
		if(!this.mahnen()&&verlaengerungen<0);{
			verlaengerungen--;
			ausleihzeit += 30;
		}
	}

	public boolean mahnen(){
		if(this.ausleihzeit == 0) {
			System.out.println("Die Ausleihzeit ist abgelaufen, bitte geben Sie das Medium ab!");

		}
		if(ausleihzeit < 0){
			System.out.println("Die Ausleihzeit ist abgelaufen, bitte geben Sie das Medium ab und bezahlen Sie die Mahngebühren!");
			return true;
		}
		return false;
	}
}