package Bibsystem;

public interface VerwaltenInterface {
    void neuesBuchEinfugen(String titel, String autor, long isbn) throws Exception;

    void getAllMedia();

    void startBibDatabase();
}
