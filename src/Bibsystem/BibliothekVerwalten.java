package Bibsystem;

import Persistenzschicht.AusleihbaresMedium;
import Persistenzschicht.BibliothekEK;
import Persistenzschicht.Bibliothekbestand;
import Persistenzschicht.Buch;

import static Persistenzschicht.BibliothekEK.getDatenbank;
import static Userinterface.Main.boot;

public class BibliothekVerwalten  {

    public static  void neuesBuchEinfugen(String titel, String autor, long isbn){

        Buch neu = new Buch(titel,autor,isbn);
        BibliothekEK.addBuch(neu);
        boot();


    }

    public static void getAllMedia(){
        Bibliothekbestand all = getDatenbank();

        for (AusleihbaresMedium medium : all.returnList()) {
            if (medium.isVerfügbarkeit())
                System.out.println(medium.getMediumID()+": "+medium.getTitel() +" von "+ medium.getAutor());
        }
    }

    public static void startBibDatabase(){
        new BibliothekEK();
    }

}
