public class Tiere {
    private int alter;
    private String Geburtsdatum;
    private int Preis;
    private int Gewicht;
    private String Name;

    public Tiere(int alter, String Geburtsdatum, int Preis, String Name) {
        this.alter = alter;
        this.Geburtsdatum = Geburtsdatum;
        this.Preis = Preis;
        this.Name = Name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getGewicht() {
        return Gewicht;
    }

    public void setGewicht(int gewicht) {
        Gewicht = gewicht;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }
}

