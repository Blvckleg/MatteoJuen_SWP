public class Cell {
    public static void initfield() {
        int[][] field = new int[50][30];
        int probability = 10; //f.e. if this is 10 then the probability is 1 out of 10
        for (int i = 0; i <= field.length-1; i++) {
            for (int j = 0; j <= field[i].length-1; j++) {
                if ((int)(Math.random() * probability) == 0) {
                    field[i][j] = 1; //voll
                    System.out.print("|1|");
                } else {
                    field[i][j] = 0; //leer
                    System.out.print("|0|");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        initfield();
    }
}

