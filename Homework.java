public class Homework {
    public static boolean isteinePrimzahl(int i){
        if(i == 1){
            return false;
        }
        return Primzahl(i,i - 1);
    }
    private static boolean Primzahl(int i, int j){
        if (j == 1){
            return true;
        }else
            if (i % j == 0)
            {
            return false;
            }
        return Primzahl(i,j-1);
    }

    public static int Summe (int i){
        if(i < 0){
            i = -i;
        }
        if(i / 10 == 0){
            return i;
        }
        return i % 10 + Summe(Summe (i / 10));
    }

}
