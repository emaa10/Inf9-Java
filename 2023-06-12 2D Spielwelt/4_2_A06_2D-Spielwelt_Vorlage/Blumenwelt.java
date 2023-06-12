/**
 * Legt die Blumenwelt an und die nicht beweglichen Objekte. 
 * 
 * @author Peter Brichzin
 * @version 12.12.19
 */
class Blumenwelt
{

    /**
     * Baut das Szenario auf.
     */
    Blumenwelt()
    {
        // Diesen Abschnitt ignorieren, es werden die 10x10 Zellen der Welt erzeugt und positioniert
        for (int zellenNummerX = 0; zellenNummerX < 10; zellenNummerX = zellenNummerX +1)
        {
            for (int zellenNummerY = 0; zellenNummerY < 10; zellenNummerY += 1)
            {

                new Zelle(50*zellenNummerX+2, 50*zellenNummerY+2, "blau");
            }
        }
        // Abschnittsende

        new Blume(6, 4);
        
    }
}
