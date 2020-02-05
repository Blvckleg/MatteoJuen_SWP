import com.sun.source.tree.WhileLoopTree;

public class main{
    private long zeitvg = 0;
    int Eier = 0;
    public Kühe Kuh1 = new Kühe(7, "12.04.2013", 800, "Luisa", 4);
    public Kühe Kuh2 = new Kühe(6, "01.03.2014", 780, "Lisl", 6);

    public Hühner Huhn1 = new Hühner(3, "29.01.2017", 200, "Gerta", 2, "W");
    public Hühner Huhn2 = new Hühner(4, "12.01.2016", 220, "Horst", 0, "M");

    public Schweine Schwein1 = new Schweine(6, "12.12.2014", 500, "Grunzer");
    public Schweine Schwein2 = new Schweine(8, "12.12.2012", 500, "Grunzeroo");

    public void main(String[] args){
        Huhn1.Eier();
        Schwein2.Schlachten();
    }

}
