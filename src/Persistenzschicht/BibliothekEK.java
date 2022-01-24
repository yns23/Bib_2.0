package Persistenzschicht;

public class BibliothekEK {


    private static final Bibliothekbestand bib = new Bibliothekbestand();


    public BibliothekEK() {
        if (bib.isEmpty())
        fillDatabase();

    }

    public static void fillDatabase(){

        Buch softwareEngineering = new Buch("Software Engineering", "Hollunder", 935029847,2,111111);
        Buch mathe1 = new Buch("Mathe Grundlagen", "Hollunder", 111068438,2,111112);
        Buch zweiterWeltkrieg = new Buch("die Geschichte über den 2. Weltkrieg", "Hollunder", 15387316,2,111113);
        Buch english = new Buch("Englisch für Informatiker", "Hollunder", 55004813,2,111114);
        Buch rechnewesen = new Buch("Rechenwesen für Dummies", "Hollunder", 956843511,2,111115);
        Buch deutsch1 = new Buch("Deutsch lernen einfach gemacht ", "Hollunder", 213548,2,111116);
        Buch physik1 = new Buch("Physik zum Lernen", "Hollunder", 101,2,111117);
        Buch harry1 = new Buch("Harry Potter und der Stein der Weisen", "Hollunder", 01142,2,111118);
        Buch harry2 = new Buch("Harry Potter und die Kammer des Schreckens", "Hollunder", 007,2,111119);
        Buch killer = new Buch("DER KRUZIFIX KILLER", "Chris Carter", 006,2,111110);

        bib.BuchHinzufügen(softwareEngineering,00000001);
        bib.BuchHinzufügen(mathe1,00000001);
        bib.BuchHinzufügen(zweiterWeltkrieg,00000001);
        bib.BuchHinzufügen(english,00000001);
        bib.BuchHinzufügen(rechnewesen,00000001);
        bib.BuchHinzufügen(deutsch1,00000001);
        bib.BuchHinzufügen(physik1,00000001);
        bib.BuchHinzufügen(harry1,00000001);
        bib.BuchHinzufügen(harry2,00000001);
        bib.BuchHinzufügen(killer,00000001);
    }

    public Bibliothekbestand getDatenbank(){
        return bib;
    }


}

