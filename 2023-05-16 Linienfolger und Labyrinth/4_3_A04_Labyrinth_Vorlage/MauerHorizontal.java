
/**
 * Eine horizontale Mauer
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class MauerHorizontal extends Rechteck
{

    /**
     * Konstruktor
     * @param x 0<=x<=15
     * @param y 0<=y<=9
     * @param breite x+breite <=15
     */
    MauerHorizontal(int x, int y, int breite)
    {
      super();
      PositionSetzen(x*50+15-1,y*50+20-1);
      GrößeSetzen(breite*50+2, 2);
      FarbeSetzen("schwarz");
    }

}
