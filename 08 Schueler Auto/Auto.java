public class Auto
{
    String marke;
    double laenge;
    double masse;
    int zulassungsjahr;
    boolean hatElektromotor;
    
    public Auto() {
        marke = "BMX";
        laenge = 4.12;
        masse = 2.31;
        zulassungsjahr = 1991;
        hatElektromotor = false;
    }
    
    public Auto(String neuMarke, double neuLaenge, double neuMasse, int neuZulaJahr, boolean neuElektorMotor ) {
        marke = neuMarke;
        laenge =neuLaenge;
        masse = neuMasse;
        zulassungsjahr = neuZulaJahr;
        hatElektromotor = neuElektorMotor;
    }
    
    public void erhoeheUmEinsZulaJahr() {
        zulassungsjahr = zulassungsjahr + 1;
    }
    
}
