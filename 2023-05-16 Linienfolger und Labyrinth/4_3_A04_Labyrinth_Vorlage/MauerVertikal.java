/**
 * Eine vertikale Mauer
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class MauerVertikal extends Rechteck
{

    /**
     * Konstruktor
     * @param x 0<=x<=15
     * @param y 0<=y<=9
     * @param höhe x+höhe <=9
     */
    MauerVertikal(int x, int y, int höhe)
    {
      super();
      PositionSetzen(x*50+15-1,y*50+20-1);
      GrößeSetzen(2, 2+höhe*50);
      FarbeSetzen("schwarz");
    }

}
