
/**
 * Verwaltet das Monster
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class Monster extends Figur
{


    public int mode = 2;    //1: normal, 2: save angles
    public int currentAngle = 90;


    /**
     * Stellt das gelb gefärbte Monster mit geschlossenem Mund dar.
     */
    void GeschlossenGelb()
    {
        EigeneFigurLöschen();
        FigurteilFestlegenEllipse(-50, -50, 100, 100, "gelb");
        FigurteilFestlegenRechteck(0, -2, 50, 4, "schwarz");
        FigurteilFestlegenEllipse(10, -40, 20, 20, "schwarz");
    }

    /**
     * Stellt das orange gefärbte Monster mit geschlossenem Mund dar.
     */
    void GeschlossenOrange()
    {
        EigeneFigurLöschen();
        FigurteilFestlegenEllipse(-50, -50, 100, 100, "orange");
        FigurteilFestlegenRechteck(0, -2, 50, 4, "schwarz");
        FigurteilFestlegenEllipse(10, -40, 20, 20, "schwarz");
    }

    /**
     * Stellt das rot gefärbte Monster mit geschlossenem Mund dar.
     */
    void GeschlossenRot()
    {
        EigeneFigurLöschen();
        FigurteilFestlegenEllipse(-50, -50, 100, 100, "rot");
        FigurteilFestlegenRechteck(0, -2, 50, 4, "schwarz");
        FigurteilFestlegenEllipse(10, -40, 20, 20, "schwarz");
    }

    /**
     * Stellt das grün gefärbte Monster mit geschlossenem Mund dar.
     */
    void GeschlossenGrün()
    {
        EigeneFigurLöschen();
        FigurteilFestlegenEllipse(-50, -50, 100, 100, "grün");
        FigurteilFestlegenRechteck(0, -2, 50, 4, "schwarz");
        FigurteilFestlegenEllipse(10, -40, 20, 20, "schwarz");
    }

    /**
     * Stellt das Monster in der angegebenen Farbe mit offenem Mund dar.
     * @param farbe die gewünschte Farbe
     */
    void Offen(String farbe)
    {
        EigeneFigurLöschen();
        FigurteilFestlegenEllipse(-50, -50, 100, 100, farbe);
        FigurteilFestlegenDreieck(0, 0, 50, -10, 50, 10, "schwarz");
        FigurteilFestlegenEllipse(10, -40, 20, 20, "schwarz");
    }
    
    /**
     * Stellt das in einer der Farben gelb, orange, rot bzw. grün mit geschlossenem Mund dar.
     * @param farbe die gewünschte Farbe
     */
    void Schließen(String farbe)
    {
        if (farbe == "gelb")
        {
            GeschlossenGelb();
        }
        if (farbe == "orange")
        {
            GeschlossenOrange();
        }
        if (farbe == "rot")
        {
            GeschlossenRot();
        }
        if (farbe == "grün")
        {
            GeschlossenGrün();
        }
    }
    
    /**
     * Stellt das in einer der Farben gelb, orange, rot bzw. grün mit offenem Mund dar.
     * @param farbe die gewünschte Farbe
     */
    void Öffnen(String farbe)
    {
        if ((farbe == "gelb") || (farbe == "orange") || (farbe == "rot") || (farbe == "grün"))
        {
            Offen(farbe);
        }
    }

    @Override void SonderTasteGedrückt(int taste) {
        // System.out.println("Sondertaste: " + taste);
        // System.out.println(currentAngle);
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
        //Gehen(10);
    }

    public int dreheZu(int angle) {
        int turn = angle - currentAngle;

        turn = -turn;

        currentAngle = angle;
        return turn;
    }

    @Override void Gehen(double länge) {  //ersetzt Gehen() basically
        switch(WinkelGeben()) {
            case 0: //rechts
                if(XPositionGeben() > 800) AktionAusführen(); //tue nichts
                else super.Gehen(länge);
                break;
            case 90://oben
                if(YPositionGeben() < 0) AktionAusführen();
                else super.Gehen(länge);
                break;
            case 180://links
               if(XPositionGeben() < 0) AktionAusführen();
               else super.Gehen(länge);
               break;
            case 270://unten
               if(YPositionGeben() > 530) AktionAusführen();
               else super.Gehen(länge);
               break;
        }
    }

    @Override void MausGeklickt(int x, int y, int anzahl) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(WinkelGeben());
    }

}
