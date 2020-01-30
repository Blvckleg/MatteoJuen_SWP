public class Kühe  extends Tiere{
    private int MilchProStunde;
    public Kühe(int alter, String Geburtsdatum, int Preis, String Name, int MilchProStunde) {
        super(alter, Geburtsdatum, Preis, Name);
        this.MilchProStunde = MilchProStunde;
    }

}
