
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
        // Gehen(10);
        switch(taste) {
            case 38:
                Gehen(10);
                break;
            case 39:
                Drehen(90);
                break;
            case 40:
                Drehen(180);
                break;
            case 37:
                Drehen(-90);
                break;
        }
    }


}
