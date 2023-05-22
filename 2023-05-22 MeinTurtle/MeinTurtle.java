
/**
 * Beschreiben Sie hier die Klasse MeinTurtle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MeinTurtle extends Turtle
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    @Override void Gehen(double länge) {
        super.Gehen(länge);
        this.Drehen(90);
        super.Gehen(1);
        this.Drehen(90);
        super.Gehen(länge);
    }
    
    /**
     * Konstruktor für Objekte der Klasse MeinTurtle
     */
    public MeinTurtle()
    {
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
}
