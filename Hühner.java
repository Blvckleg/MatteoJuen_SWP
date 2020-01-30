public class Hühner extends Tiere{
    private int EierProStunde;
    private String Geschlecht;
    public Hühner(int alter, String Geburtsdatum, int Preis, String Name, int EierProStunde, String Geschlecht) {
        super(alter, Geburtsdatum, Preis, Name);
        this.Geschlecht = Geschlecht;
        this.EierProTag = EierProTag;

    }
    public int Eier(){
        while(Huhn1 == "W") {
            if (zeitvg >= java.lang.System.currentTimeMillis()+60000) {
                return Eier + EierProStunde;
            }
        }
        zeitvg = java.lang.System.currentTimeMillis();
    }

}
