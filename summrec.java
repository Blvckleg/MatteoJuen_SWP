public class summrec {
    int result;

    public static int summe(int anzsum) {
        if (anzsum == 1) {
            return 1;
        }
        return anzsum + summe(anzsum - 1);
    }


        public static void main(String[] args) {
            int result = summe(10);
            System.out.println(result);
        }
}
