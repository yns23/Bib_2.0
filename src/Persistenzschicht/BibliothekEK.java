package Persistenzschicht;

public class BibliothekEK {


    private static final Bibliothekbestand bib = new Bibliothekbestand();


    public BibliothekEK() {
        if (bib.isEmpty())
            fillDatabase();

    }

    public static void fillDatabase(){

        Buch softwareEngineering = new Buch("Software Engineering", "Hollunder", 935029847);
        bib.BuchHinzufügen(softwareEngineering);
        Buch mathe1 = new Buch("Mathe Grundlagen", "Hollunder", 111068438);
        bib.BuchHinzufügen(mathe1);
        Buch zweiterWeltkrieg = new Buch("die Geschichte über den 2. Weltkrieg", "Hollunder", 15387316);
        bib.BuchHinzufügen(zweiterWeltkrieg);
        Buch english = new Buch("Englisch für Informatiker", "Hollunder", 55004813);
        bib.BuchHinzufügen(english);
        Buch rechnewesen = new Buch("Rechenwesen für Dummies", "Hollunder", 956843511);
        bib.BuchHinzufügen(rechnewesen);
        Buch deutsch1 = new Buch("Deutsch lernen einfach gemacht ", "Hollunder", 213548);
        bib.BuchHinzufügen(deutsch1);
        Buch physik1 = new Buch("Physik zum Lernen", "Hollunder", 101);
        bib.BuchHinzufügen(physik1);
        Buch harry1 = new Buch("Harry Potter und der Stein der Weisen", "Hollunder", 01142);
        bib.BuchHinzufügen(harry1);
        Buch harry2 = new Buch("Harry Potter und die Kammer des Schreckens", "Hollunder", 007);
        bib.BuchHinzufügen(harry2);
        Buch killer = new Buch("DER KRUZIFIX KILLER", "Chris Carter", 006);
        bib.BuchHinzufügen(killer);
    }

    public static long newID(){
        long id = 0;
        for (Buch buch : bib.returnList()) {
            id++;
        }
        return ++id;
    }

    public static Bibliothekbestand getDatenbank(){
        return bib;
    }

    public static void addBuch(Buch buch){
        bib.BuchHinzufügen(buch);
    }


}

