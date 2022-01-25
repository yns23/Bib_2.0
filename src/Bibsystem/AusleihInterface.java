package Bibsystem;

import Persistenzschicht.AusleihbaresMedium;
import Persistenzschicht.Ausleihkonto;

public interface AusleihInterface {

    void neuesBuchHinzufügen(Ausleihkonto a, AusleihbaresMedium m) throws Exception;

    void auswahlBuch(Ausleihkonto loggedIn, int i) throws Exception;
}
