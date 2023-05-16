
/**
 * Spielfigur
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class Spielfigur extends Figur
{
    int delta;
    /**
     * Legt die Form und die Startposition der Spielfigur fest
     */
    Spielfigur()
    {
        FigurteilFestlegenEllipse(-50, -50, 100, 100, "rot");
        delta = 1;
        PositionSetzen(338,143);
    }

    /*
     * Hier die vier Methoden NachLinksBewegen(), NachRechtsBewegen(), 
     * NachUntenBewegen(), NachObenBewegen() ergänzen!
     * Tipp 1: Lege erst die Methoden ohne Rumpf an, damit du von Anfang an 
     * Testen kannst!
     * Tipp 2: Um die Turtle in eine bestimmte Richtung zu drehen, kannst du
     * die Methode WinkelSetzen(winkel) nutzen (Ost: 0; Nord: 90, ...)
     */
    
    
    /**
     * Wird aufgerufen, wenn eine Sondertaste gedrückt wurde
     * @param taste Nummer der Sondertaste
     */
    @Override void SonderTasteGedrückt(int taste)
    {
        switch(taste)
        {
            case 37: NachLinksBewegen(); break;
            case 38: NachObenBewegen(); break;
            case 39: NachRechtsBewegen(); break;
            case 40: NachUntenBewegen(); break;
        }
    }
}
