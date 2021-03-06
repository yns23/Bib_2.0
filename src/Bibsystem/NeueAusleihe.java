package Bibsystem;

import Persistenzschicht.AusleihbaresMedium;
import Persistenzschicht.Ausleihen;
import Persistenzschicht.Ausleihkonto;
import Persistenzschicht.Bibliothekbestand;

import static Persistenzschicht.BibliothekEK.getDatenbank;
import static Userinterface.Main.boot;

public class NeueAusleihe implements AusleihInterface{

    AusleihbaresMedium medium;
    Ausleihkonto nutzer;

    @Override
    public void neuesBuchHinzufügen(Ausleihkonto a, AusleihbaresMedium m) throws Exception {
        new Ausleihen(a, m);
        boot();
    }

    @Override
    public void auswahlBuch(Ausleihkonto loggedIn, int i) throws Exception {
        nutzer=loggedIn;
        Bibliothekbestand bib = getDatenbank();
        boolean check = false;
        for (AusleihbaresMedium medium : bib.returnList() ) {
            if (medium.getMediumID()==i){
               this.medium=medium;
               check = true;
            }
        }
        if(!check)
            System.out.println("Fehler!");

        neuesBuchHinzufügen(nutzer,medium);
    }

}
