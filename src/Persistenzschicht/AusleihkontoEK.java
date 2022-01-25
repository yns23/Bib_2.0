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

    public ArrayList getList(){
        return ausleihkonten;
    }

    public static void fillDatabase(){
        Ausleihkonto yunus = new Ausleihkonto("antily","hallo123", Fakultät.Informatik);
        Ausleihkonto alex = new Ausleihkonto("grosaa","hallo123" ,Fakultät.Informatik);

        ausleihkonten.add(yunus);
        ausleihkonten.add(alex);
    }

    public ArrayList<Ausleihkonto> getAusleihkontos() {
        return ausleihkontos;
    }

    public static long newID(){

        long id = 0;

        for (Ausleihkonto ausleihkonto : ausleihkonten) {
            id++;
        }
        return ++id;
    }

    public static Ausleihkonto passwordCheck(String bn, String pw) throws Exception {
        if(getAusleihkonto(bn).getPasswort().equals(pw)){
            System.out.println("klappt");
            return getAusleihkonto(bn);
        }
        else {
            System.out.println("klapptnicht ");
            throw new Exception();
        }
    }

    public static Ausleihkonto getAusleihkontoat(int a){
        return ausleihkonten.get(a);
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