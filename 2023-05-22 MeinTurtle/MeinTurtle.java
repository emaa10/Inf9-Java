
/**
 * Beschreiben Sie hier die Klasse MeinTurtle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MeinTurtle extends Turtle
{
    double wegstrecke;

    @Override void Gehen(double länge) {
        super.Gehen(länge); //strich 1
        this.Drehen(90);
        super.Gehen(1);
        this.Drehen(90);
        super.Gehen(länge); //strich 2
        this.Drehen(270);
        this.Gehen(1);
        this.Drehen(270);
        this.Gehen(länge);  //strich 3

        wegstrecke += länge;
    }
    
    /**
     * Konstruktor für Objekte der Klasse MeinTurtle
     */
    public MeinTurtle()
    {
        super();
        wegstrecke = 0.0;
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
