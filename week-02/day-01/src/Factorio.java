public class Factorio {
    public static void main(String[] args) {
        System.out.println(Factorio(3));
    }
    public static int Factorio(int num) {
        int factNum = 1;
        for (int i = 1; i <= num; i++) {
            factNum *= i;
        }
        return factNum;
    }
}
