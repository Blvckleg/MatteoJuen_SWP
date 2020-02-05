public class Schweine extends Tiere {
    private int Speck = 0;
    long zeitvg = java.lang.System.currentTimeMillis();
    public Schweine(int alter, String Geburtsdatum, int Preis, String Name) {
        super(alter, Geburtsdatum, Preis, Name);
    }
    public boolean Schlachtreif()
    {
            if (alter >= 4) {
                return true;
            }
            else {
                return false;
        }
    }
    public void Schlachten() {
        if (Schlachtreif() == true)
        {
            Speck += 10;
            setAlter(0);
        }
    }
}
