public class Kühe  extends Tiere{
    private int MilchProStunde;
    private int Milch = 0;
    long zeitvg = java.lang.System.currentTimeMillis();
    public Kühe(int alter, String Geburtsdatum, int Preis, String Name, int MilchProStunde) {
        super(alter, Geburtsdatum, Preis, Name);
        this.MilchProStunde = MilchProStunde;
    }


    public int Milch(){
        if (MilchProStunde > 0) {
            if (java.lang.System.currentTimeMillis() >= zeitvg+60000) {
                return Milch + MilchProStunde;
            }
        }
        zeitvg = java.lang.System.currentTimeMillis();
        return Milch;
    }

}
