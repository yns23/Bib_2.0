package Bibsystem;

import Persistenzschicht.Ausleihkonto;

import static Persistenzschicht.AusleihkontoEK.passwordCheck;

public class Login {

    Ausleihkonto loggedInUser;

    public Ausleihkonto tryLogin(String bn, String pw) throws Exception {
        this.loggedInUser=passwordCheck(bn,pw);
        return loggedInUser;
    }
}
