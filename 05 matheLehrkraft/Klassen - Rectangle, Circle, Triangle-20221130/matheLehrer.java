
/**
 * Beschreiben Sie hier die Klasse matheLehrer.
 * 
 * @author Emanuel Berger
 * @version 2023-02-14
 */
public class matheLehrer {
    private String name;
    private int anzahlGehirnzellen;


    public matheLehrer() {
        // Instanzvariable initialisieren
        name = "Herr Merta";
        anzahlGehirnzellen = 200000;
    }


    public void vorstellen() {
        System.out.println("Ich heiﬂe " + name);
    }
    
    public void mitGehirnzellenFlexen() {
        System.out.println("Ich habe mehr Gehirnzellen als du. Ich habe " + anzahlGehirnzellen + " Gehirnzellen!!");
    }
    public void mehrGehirnzellenGenerieren() {
        anzahlGehirnzellen += 2000;
        System.out.println("Ich habe mehr Gehirnzellen als du. Ich habe " + anzahlGehirnzellen + " Gehirnzellen!!");
    }
}