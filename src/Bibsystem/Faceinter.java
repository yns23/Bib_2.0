package Bibsystem;

import Persistenzschicht.Ausleihkonto;

public interface Faceinter {

    public Ausleihkonto tryLogin(String bn, String pw) throws Exception;

}
