
/**
 * Beschreiben Sie hier die Klasse TastaturTurtle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TastaturTurtle extends Turtle
{
    public int mode = 2;    //1: normal, 2: save angles
    public int currentAngle = 90;

    @Override void SonderTasteGedrückt(int taste) {
        if(mode == 1) {
            System.out.println("Sondertaste: " + taste);
            // Gehen(10);
            switch(taste) {
                case 38:
                    Gehen(10);
                    break;
                case 37:
                    Drehen(90);
                    break;
                case 40:
                    Drehen(180);
                    break;
                case 39:
                    Drehen(-90);
                    break;
                    
            }
        }
        else {
            System.out.println("Sondertaste: " + taste);
            System.out.println(currentAngle);
            switch(taste) {
                case 38:    //pfeil hoch
                    Drehen(dreheZu(0));
                    break;
                case 39:    //pfeil rechts
                    Drehen(dreheZu(90));
                    break;
                case 40:    //pfeil runter
                    Drehen(dreheZu(180));
                    break;
                case 37:    //pfeil links
                    Drehen(dreheZu(-90));
                    break;
                    
            }
            Gehen(10);
        }
    }

    public int dreheZu(int angle) {
        int turn = angle - currentAngle;

        turn = -turn;

        currentAngle = angle;
        return turn;
    }

    @Override void MausGeklickt(int x, int y, int anzahl) {
        
        PositionSetzen(x, y);
    }
}
