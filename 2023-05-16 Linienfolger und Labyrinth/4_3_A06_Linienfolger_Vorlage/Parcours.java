
/**
 * Verwaltet den Gesamtparcours.
 * 
 * @author Franz Jetzinger
 * @version 1.0
 */
class Parcours
{

    /**
     * Baut die Linien und das Ziel auf
     */
    Parcours()
    {
        new LinieWaagerecht(0,160,120, 10);
        //Ab hier die Linien ergänzen
        
        Rechteck linienende = new Rechteck();
        linienende.FarbeSetzen("blau");
        linienende.PositionSetzen(720,405);
        linienende.GrößeSetzen(20,20);  
    }
}
