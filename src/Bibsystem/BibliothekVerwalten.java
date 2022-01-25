package Bibsystem;

import Persistenzschicht.AusleihbaresMedium;
import Persistenzschicht.BibliothekEK;
import Persistenzschicht.Bibliothekbestand;
import Persistenzschicht.Buch;

import static Persistenzschicht.BibliothekEK.getDatenbank;
import static Userinterface.Main.boot;

public class BibliothekVerwalten implements VerwaltenInterface {

    @Override
    public void neuesBuchEinfugen(String titel, String autor, long isbn) throws Exception {

        Buch neu = new Buch(titel,autor,isbn);
        BibliothekEK.addBuch(neu);
        boot();


    }

    @Override
    public void getAllMedia(){
        Bibliothekbestand all = getDatenbank();

        for (AusleihbaresMedium medium : all.returnList()) {
            if (medium.isVerfügbarkeit())
                System.out.println(medium.getMediumID()+": "+medium.getTitel() +" von "+ medium.getAutor());
        }
    }

    @Override
    public void startBibDatabase(){
        new BibliothekEK();
    }

}
