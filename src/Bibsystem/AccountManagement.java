package Bibsystem;

import Persistenzschicht.Ausleihen;
import Persistenzschicht.Ausleihkonto;
import Persistenzschicht.AusleihkontoEK;
import Persistenzschicht.Fakultät;

import java.util.ArrayList;

import static Persistenzschicht.AusleihkontoEK.addAusleihkonto;
import static Userinterface.Main.boot;

public class AccountManagement {


    public static void neuerBenutzer(String benutzername, String passwort, Fakultät fakultaet) throws Exception {
        Ausleihkonto neu = new Ausleihkonto(benutzername, passwort,fakultaet);
        addAusleihkonto(neu);
        boot();

    }

    public static void alleAusgeliehenenMedien(Ausleihkonto ausleihkonto){
        ArrayList<Ausleihen> ausgeliehen = ausleihkonto.getAusgelieheneMedien();

        for (Ausleihen ausleihen : ausgeliehen) {
            System.out.println( ausleihen.getAusleihID() +"             "+ ausleihen.getObjekt().getMediumID() +"                     "+ ausleihen.getVerlaengerungen() +"                 "+ ausleihen.getAusleihzeit() +"             "+ ausleihen.getObjekt().getTitel());
        }
    }

    public static void mediumVerlaengern(Ausleihkonto user, int ausleihID) throws Exception {
        ArrayList<Ausleihen> ausgeliehen = user.getAusgelieheneMedien();
        for (Ausleihen ausleihen : ausgeliehen) {
            if (ausleihen.getAusleihID()==ausleihID){
                ausleihen.Verlängern();
            }
        }
        boot();

    }

    public static void mediumRuckgabe(Ausleihkonto ausleihkonto, int ausleihID) throws Exception {
        ausleihkonto.mediumRuckgabe(ausleihID);
        boot();
    }

    public static void startAccDatabase(){
        new AusleihkontoEK();

    }
}
