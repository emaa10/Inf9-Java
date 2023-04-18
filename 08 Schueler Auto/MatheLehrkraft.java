
/**
 * Beschreiben Sie hier die Klasse MatheLehrkraft.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MatheLehrkraft
{
    int anzahlGehirnzellen;
    String name;

    /**
     * Konstruktor für Objekte der Klasse MatheLehrkraft
     */
    public MatheLehrkraft()
    {
        name = "Hr. Müller";
        anzahlGehirnzellen = 200000;
        
    }
    
    public void vorstellen() {
        System.out.println("Ich heiße " + name);
    }

    
}
