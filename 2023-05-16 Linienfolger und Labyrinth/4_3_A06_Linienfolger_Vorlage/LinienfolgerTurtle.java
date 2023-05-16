/**
 * Die Turtle folgt einer gegebenen Linie
 * 
 * @author Franz Jetzinger
 * @version 1.0
 */
class LinienfolgerTurtle extends Turtle
{

    /**
     * Legt die Position der Turtle fest
     */
    LinienfolgerTurtle()
    {
        super();
        PositionSetzen(0, 160);
        StiftHeben();
    }

    //Hier die Methode LinieFolgen() ergänzen
    void LinieFolgen() {
        while(!Berührt("blau")) {
            while(Berührt("schwarz")) {
                Gehen(1);
            } 
            Drehen(90);
            Gehen(1);
        }
    }
    
}
