
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

    public Schueler(String newNachname, String newVorname, String newGeschlecht, int newAlter)
    {
        nachname = newNachname;
        vorname = newVorname;
        geschlecht = newGeschlecht;
        alter = newAlter;

    }

    public void istVolljaehrig() {
        if (alter >= 18) {
            System.out.println("Ist vollj�hrig"); 
        } else {
            System.out.println("Ist nicht vollj�hrig");            
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

    public void noteAlsBezeichnung(int note) {
        switch(note) {
            case 1: System.out.println(note + ": sehr gut"); break;
            case 2: System.out.println(note + ": gut"); break;
            case 3: System.out.println(note + ": befriedigend"); break;
            case 4: System.out.println(note + ": ausreichend"); break;
            case 5: System.out.println(note + ": mangelhaft"); break;
            case 6: System.out.println(note + ": ungenügend"); break;
            default: System.out.println("Keine gültige Note!"); break;
        }
    }

    public void noteAlsBezeichnung2(int note) {
        if(note == 1) {
            System.out.println(note + ": sehr gut");
        }
        else if(note == 2) {
            System.out.println(note + ": gut");
        }
        else if(note == 3) {
            System.out.println(note + ": befriedigend");
        }
        else if(note == 4) {
            System.out.println(note + ": ausreichend");
        }
        else if(note == 5) {
            System.out.println(note + ": mangelhaft");
        }
        else if(note == 6) {
            System.out.println(note + ": ungenügend");
        }
        else {
            System.out.println("Keine gültige Note!");
        }
    }

    public void gibHimmelsrichtungen(char richtung) {
        switch(richtung) {
            case 'n': System.out.println("Norden"); break;
            case 'o': System.out.println("Osten"); break;
            case 's': System.out.println("Süden"); break;
            case 'w': System.out.println("Westen"); break;
            default: System.out.println("Keine gültige Himmelsrichtung!"); break;
        }
    }

    public void segment(int zahl) {
        switch(zahl) {
            case 0:
                System.out.println(" - ");
                System.out.println("| |");
                System.out.println();
                System.out.println("| |");
                System.out.println(" - ");
                break;
            case 1:
                System.out.println(" - ");
                System.out.println("  |");
                System.out.println();
                System.out.println("  |");
                break;
            case 2:
                System.out.println(" - ");
                System.out.println("  |");
                System.out.println(" - ");
                System.out.println("|  ");
                System.out.println(" - ");
                break;
            case 3:
                System.out.println(" - ");
                System.out.println("  |");
                System.out.println(" - ");
                System.out.println("  |");
                System.out.println(" - ");
                break;
            case 4:
                System.out.println("   ");
                System.out.println("| |");
                System.out.println(" - ");
                System.out.println("  |");
                System.out.println("   ");
                break;
            case 5:
                System.out.println(" - ");
                System.out.println("|  ");
                System.out.println(" - ");
                System.out.println("  |");
                System.out.println(" - ");
                break;
            case 6:
                System.out.println("|  ");
                System.out.println(" - ");
                System.out.println("| |");
                System.out.println(" - ");
                break;
            case 7:
                System.out.println(" - ");
                System.out.println("  |");
                System.out.println("  ");
                System.out.println("  |");
                break;
            case 8:
                System.out.println(" - ");
                System.out.println("| |");
                System.out.println(" - ");
                System.out.println("| |");
                System.out.println(" - ");
                break;
            case 9:
                System.out.println(" - ");
                System.out.println("| |");
                System.out.println(" - ");
                System.out.println("  |");
                System.out.println(" - ");
                break;
            default:
                System.out.println("Keine gültige Zahl!");
        }

    }
    
    public void gibUhrzeit(int zahl1, int zahl2, int zahl3, int zahl4) {
        segment(zahl1);
        segment(zahl2);
        System.out.println(":");
        segment(zahl3);
        segment(zahl4);
    }
}