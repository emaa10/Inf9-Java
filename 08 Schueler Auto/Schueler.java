
/**
 * Beschreiben Sie hier die Klasse Schueler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schueler
{
    String nachname;
    String vorname;
    String geschlecht;
    int alter;    
    boolean erwachsen;

    public Schueler(String newNachname, String newVorname, String newGeschlecht, int newAlter)
    {
        nachname = newNachname;
        vorname = newVorname;
        geschlecht = newGeschlecht;
        alter = newAlter;

    }

    public void istVolljaehrig() {
        if (alter >= 18) {
            erwachsen = true;
            System.out.println("Ist volljährig"); 
        } else {
            erwachsen = false;
            System.out.println("Ist nicht volljährig");            
        }
    }

    public int addieren(int zahl1, int zahl2) {
        int result = 0;
        result = zahl1 + zahl2;

        return result;
    }

    public void sagMama() {
        System.out.println("Mama");
    }

    public String briefanschrift() {
        String anschrift = "";

        if (geschlecht.equals("m")) {
            anschrift = "Ihr Sohn";
        } else {
            anschrift = "Ihre Tochter";
        }

        return anschrift;
    }

    public void kompletteAnrede() {
        System.out.println("Liebe Eltern, " + briefanschrift());
    }

    public void wiederholeZehnMal() {
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Schleifendurchlauf-Nummer: " + i);
            sagMama();
        }
    }

    public void gibGeradeZahlen() {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Oder:");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i*2);
        }
    }
    
    public double oberflaeche(double radius) {
        double result;
        
        result = 4*Math.PI*radius*radius;
        
        return result;
    }
    
    public double eineSchachtel() {
        int anzahlRoteKugeln = 6;
        int durchmesser = 8;
        
        double result;
        
        result = oberflaeche(durchmesser/2)*anzahlRoteKugeln;
        
        return result;
    }
    
    public double nSchachteln(int anzahlSchachteln) {
        double result;
        
        result = anzahlSchachteln*eineSchachtel();
        
        return result;
    }
    


}
