
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
     * Konstruktor f�r Objekte der Klasse MatheLehrkraft
     */
    public MatheLehrkraft()
    {
        name = "Hr. M�ller";
        anzahlGehirnzellen = 200000;
        
    }
    
    public void vorstellen() {
        System.out.println("Ich hei�e " + name);
    }

    
}
