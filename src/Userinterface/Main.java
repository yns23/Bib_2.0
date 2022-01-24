package Userinterface;

import Persistenzschicht.BibliothekEK;
import Persistenzschicht.Bibliothekbestand;

public class Main {
    public static void main(String[] args) throws Exception {

        Bibliothekbestand neu = new BibliothekEK().getDatenbank();
        Bibliothekbestand neu2 = new BibliothekEK().getDatenbank();

        System.out.println(neu.TitelSuche("Software Engineering").getTitel());
        System.out.println(neu.TitelSuche("Software Engineering").getTitel());

    }
}
