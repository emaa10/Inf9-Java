
/**
 * Beschreiben Sie hier die Klasse TurtleStern.
 * 
 * @author Emanuel Berger 
 * @version v1.0.0
 */
public class TurtleStern extends Turtle
{
    private int x;

    /**
     * Konstruktor für Objekte der Klasse TurtleStern
     */
    public TurtleStern()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    @Override void Gehen(double länge) {
        for(int i=0; i<6; i++) {
            super.Gehen(länge);
            this.Drehen(120);
            super.Gehen(länge);
            this.Drehen(240);
        }
    }
}
