package Bibsystem;

import Persistenzschicht.Ausleihkonto;
import Persistenzschicht.Fakultät;

public interface BibInterface {

     void neuerBenutzer(String benutzername, String passwort, Fakultät fakultaet) throws Exception;

     void alleAusgeliehenenMedien(Ausleihkonto ausleihkonto);

     void mediumVerlaengern(Ausleihkonto user, int ausleihID) throws Exception;

     void mediumRuckgabe(Ausleihkonto ausleihkonto, int ausleihID) throws Exception;

     void startAccDatabase();
}
