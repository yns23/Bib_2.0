package Userinterface;

import Bibsystem.*;
import Persistenzschicht.Ausleihkonto;
import Persistenzschicht.Fakultät;
import java.util.Scanner;

public class Main {

    static Ausleihkonto loggedInUser;

    public static void main(String[] args) throws Exception {
            logIn();



    }

    public static void boot() throws Exception {
        System.out.println("\nBitte wählen Sie von volgenden Auswahlmöglichkeiten aus:");
        System.out.println("--------------------------------------------------------");
        System.out.println("1. Ausleihberechtigte Person anlegen.");
        System.out.println("2. Ausleihbare Medien in Bibliotheksbestand aufnehmen.");
        System.out.println("3. Buch ausleihen.");
        System.out.println("4. Buch verlängern.");
        System.out.println("5. Buch zurückgeben.");
        System.out.println("6. Logout.");

        Scanner scanner = new Scanner(System.in);


        switch (scanner.nextInt()) {
            case 1 -> anlegenAusleihberechtigten();
            case 2 -> aufnahmeBuch();
            case 3 -> Ausleihe();
            case 4 -> Verlaengerung();
            case 5 -> Rückgabe();
            case 6 -> logIn();
            default -> {
                System.out.println("Keine gültige Eingabe! Aufwiedersehen!");
                System.exit(0);
            }
        }
    }

    public static void anlegenAusleihberechtigten() throws Exception {
        System.out.print("Bitte geben Sie einen neuen Benuzernamen ein:");
        Scanner bn = new Scanner(System.in);
        String benutzername = bn.nextLine();
        System.out.print("Bitte geben Sie einen Passwort ein:");
        Scanner pw = new Scanner(System.in);
        String passwort = bn.nextLine();
        System.out.println("Wählen Sie eine Fakultät aus.");
        System.out.println("-----------------------------");
        System.out.println("1. Informatik");
        System.out.println("2. Mediendesign");
        System.out.println("3. Wirtschaft");
        System.out.println("4. Medizin");
        System.out.println("5. Mechatronik\n");
        System.out.print("Auswahl eingeben: ");
        Scanner fk = new Scanner(System.in);


        switch (fk.nextInt()) {
            case 1 -> new AccountManagement().neuerBenutzer(benutzername,passwort, Fakultät.Informatik);
            case 2 -> new AccountManagement().neuerBenutzer(benutzername,passwort, Fakultät.Mediendesign);
            case 3 -> new AccountManagement().neuerBenutzer(benutzername,passwort, Fakultät.Wirtschaft);
            case 4 -> new AccountManagement().neuerBenutzer(benutzername,passwort, Fakultät.Medizin);
            case 5 -> new AccountManagement().neuerBenutzer(benutzername,passwort, Fakultät.Mechanik);
        }




    }

    public static void aufnahmeBuch() throws Exception {
        System.out.println("Bitte geben Sie die Daten des neuen Buches ein:");
        System.out.println("-----------------------------------------------");
        System.out.print("Titel: ");
        Scanner titel = new Scanner(System.in);
        String titelNeu = titel.nextLine();
        System.out.print("Autor: ");
        Scanner autor = new Scanner(System.in);
        String autorNeu = autor.nextLine();
        System.out.print("ISBN: ");
        Scanner isbn = new Scanner(System.in);
        long isbnNeu = isbn.nextLong();

        new BibliothekVerwalten().neuesBuchEinfugen(titelNeu,autorNeu,isbnNeu);



    }

    public static void Ausleihe() throws Exception {
        System.out.println("Bitte Suchen Sie sich ein Buch zum ausleihen aus:");
        new BibliothekVerwalten().getAllMedia();
        Scanner scanner = new Scanner(System.in);
        new NeueAusleihe().auswahlBuch(loggedInUser,scanner.nextInt());

    }

    public static void Verlaengerung() throws Exception {
        System.out.println("Suchen Sie sich ein Medium nach der AusleihID aus, welches sie verlängern möchten:");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("AusleihID      BuchID     mögliche Verlängerungen       Frist          Titel ");
        new AccountManagement().alleAusgeliehenenMedien(loggedInUser);
        Scanner scanner = new Scanner(System.in);
        int auswahl = scanner.nextInt();
        new AccountManagement().mediumVerlaengern(loggedInUser, auswahl);



    }

    public static void Rückgabe() throws Exception {
        System.out.println("Suchen Sie sich ein Buch aus welches sie zurückgeben möchten:");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("AusleihID      BuchID     mögliche Verlängerungen       Frist          Titel ");
        new AccountManagement().alleAusgeliehenenMedien(loggedInUser);
        Scanner scanner = new Scanner(System.in);
        int auswahl = scanner.nextInt();
        new AccountManagement().mediumRuckgabe(loggedInUser, auswahl);
    }

    public static void logIn() throws Exception {
        new AccountManagement().startAccDatabase();


        System.out.print("Bitte geben Sie ihr Benutzernamen ein: ");
        Scanner bn = new Scanner(System.in);
        String benutzername = bn.nextLine();
        System.out.print("Bitte geben Sie ihr Passwort ein: ");
        Scanner pw = new Scanner(System.in);
        String passowrt = pw.nextLine();

        loggedInUser = new Login().tryLogin(benutzername,passowrt);


        new BibliothekVerwalten().startBibDatabase();
        boot();
    }

}
