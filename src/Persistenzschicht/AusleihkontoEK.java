package Persistenzschicht;

import java.util.ArrayList;

public class AusleihkontoEK {

    protected ArrayList<Ausleihkonto> ausleihkontos;

    public AusleihkontoEK(ArrayList<Ausleihkonto> ausleihkontos) {
        this.ausleihkontos = ausleihkontos;

        Ausleihkonto yunus = new Ausleihkonto(0, Fakultät.Informatik);
        Ausleihkonto alex = new Ausleihkonto(0, Fakultät.Informatik);

        ausleihkontos.add(yunus);
        ausleihkontos.add(alex);
    }

    public ArrayList<Ausleihkonto> getAusleihkontos() {
        return ausleihkontos;
    }
    public Ausleihkonto getAusleihkonto(int a){
        return ausleihkontos.get(a);
    }
    public int anzahlAusleihkontos(){return ausleihkontos.size();}
    public void addAusleihkonto(Ausleihkonto a){
        this.ausleihkontos.add(a);
        System.out.println(" Ausleihkonto " + a + " wurde erfolgreich hinzugefügt!");
    }
    public void entferneAusleihkonto(Ausleihkonto a){
        ausleihkontos.remove(a);
    }
}