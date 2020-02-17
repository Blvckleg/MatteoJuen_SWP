import com.sun.source.tree.WhileLoopTree;

public class main{
    private long zeitvg = 0;
    int Eier = 0;
    public Kuehe Kuh1 = new Kuehe(7, "12.04.2013", 800, "Luisa", 4);
    public Kuehe Kuh2 = new Kuehe(6, "01.03.2014", 780, "Lisl", 6);

    public Huehner Huhn1 = new Huehner(3, "29.01.2017", 200, "Gerta", 2, "W");
    public Huehner Huhn2 = new Huehner(4, "12.01.2016", 220, "Horst", 0, "M");

    public Schweine Schwein1 = new Schweine(6, "12.12.2014", 500, "Grunzer");
    public Schweine Schwein2 = new Schweine(8, "12.12.2012", 500, "Grunzeroo");

    public void main(String[] args){
        Huhn1.Eier();
        Schwein2.Schlachten();
    }

}
