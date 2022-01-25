package Bibsystem;

import Persistenzschicht.Ausleihkonto;
import Persistenzschicht.AusleihkontoEK;
import Persistenzschicht.Fakultät;

import static Persistenzschicht.AusleihkontoEK.addAusleihkonto;
import static Userinterface.Main.boot;

public class AccountManagement {


    public static void neuerBenutzer(String benutzername, String passwort, Fakultät fakultaet){
        Ausleihkonto neu = new Ausleihkonto(benutzername, passwort,fakultaet);
        addAusleihkonto(neu);
        boot();

    }

    public static void startAccDatabase(){
        new AusleihkontoEK();

    }
}
