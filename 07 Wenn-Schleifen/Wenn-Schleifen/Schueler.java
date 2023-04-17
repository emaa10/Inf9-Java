
/**
 * Beschreiben Sie hier die Klasse Schueler.
 * 
 * @author Emanuel Berger
 * @version v1
 */
public class Schueler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    String vorname="Default";
    String nachname="Default";
    String geschlecht="m";

    /**
     * Konstruktor für Objekte der Klasse Schueler
     */
    public Schueler(String newVorname, String newNachname, String newGeschlecht)
    {
        vorname = newVorname;
        nachname = newNachname;
        geschlecht = newGeschlecht;
    }

    /**
     * Calculator - Simple edition
     * 
     * @param  art    1 -> Plus, 2 -> Minus, 3 -> Geteilt, 4 -> Mal
     * @param  zahl1    Input var1
     * @param  zahl2    Input var2
     * @return        Rechenergebnis
     */
    public double calculate(int art, double zahl1, double zahl2) {
        double result=0;
        if(art == 1) {
            result = zahl1 + zahl2;
        } else if(art == 2) {
            result = zahl1 - zahl2;
        } else if(art == 3) {
            result = zahl1 / zahl2;
        } else if(art == 4) {
            result = zahl1 * zahl2;
        }
        return result;
    }
    
    public void sageMama() {
        System.out.println("Mama");
    }
    
    public String briefanschrift() {
        String anschrift="";
        
        if(geschlecht.equals("m")) {
            anschrift = "Ihr Sohn";
        } else if(geschlecht.equals("f")) {
            anschrift = "Ihre Tochter";
        }
        return anschrift;
    }
    
    public void kompletteAnrede() {
        System.out.println("Liebe Eltern, " + briefanschrift());
    }

    public double oberflaeche(double radius) {
        double result;

        result = 4*Math.PI*radius;

        return result;
    }

    public double eineSchachtel() {
        double result;

        const int anzahlKugeln = 6;
        const int durchmesser = 8;
        const int radius = durchmesser/2;

        result = oberflaeche(radius)*anzahlKugeln;

        return result;
    }

    public double nSchachteln(int n) {
        double result;

        result = n*eineSchachtel();

        return result;
    }

    public double nSchachtelnVolumen(int n) {
        const int durchmesser = 8;
        const int radius = durchmesser/2;

        const int anzahlReihen = 2;     //2 reihen von kugeln
        const int anzahlSpalten = 4;    //4 kugeln pro reihe
        const int anzahlKugeln = anzahlReihen*anzahlSpalten;

        //eine schachtel
        double hoehe = anzahlReihen * durchmesser;
        double breite = anzahlSpalten * durchmesser;

        double result = hoehe * breite * durchmesser * n;   //volumen von anzahl schachteln
        return result;
    }
}
