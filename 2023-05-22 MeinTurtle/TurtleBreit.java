
/**
 * Beschreiben Sie hier die Klasse TurtleBreit.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TurtleBreit extends Turtle
{

    /**
     * Bewegt die Turtle nach vorne.
     * Die gezeichnete Linie ist 3 Einheiten breit.
     * @param länge Anzahl der Längeneinheiten
     */
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
    }
}
