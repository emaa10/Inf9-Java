
/**
 * Beschreiben Sie hier die Klasse TastaturTurtle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TastaturTurtle extends Turtle
{
    @Override void SonderTasteGedrückt(int taste) {
        System.out.println("Sondertaste: " + taste);
        Gehen(10);
    }

}
