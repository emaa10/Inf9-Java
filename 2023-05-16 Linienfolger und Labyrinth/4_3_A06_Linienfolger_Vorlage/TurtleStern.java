
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

    public void zeichneStern() {
        for(int i=0; i<10; i++) {
            Gehen(60);
            Drehen(120);
            Gehen(60);
            Drehen(60);
        }

    }
}
