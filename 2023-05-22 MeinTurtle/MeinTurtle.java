
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
        super.Gehen(länge);

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
}
