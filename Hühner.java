public class Hühner extends Tiere{
    private int Eier;
    private int EierProStunde;
    private String Geschlecht;
    long zeitvg = java.lang.System.currentTimeMillis();
    public Hühner(int alter, String Geburtsdatum, int Preis, String Name, int EierProStunde, String Geschlecht) {
        super(alter, Geburtsdatum, Preis, Name);
        this.Geschlecht = Geschlecht;
        this.EierProStunde = EierProStunde;

    }
    public int Eier(){
        while(Geschlecht == "W") {
            if (java.lang.System.currentTimeMillis() >= zeitvg+60000) {
                return Eier + EierProStunde;
            }
            return Eier;
        }
        zeitvg = java.lang.System.currentTimeMillis();
    }

}
