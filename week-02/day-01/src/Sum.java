public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }

    public static int sum(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            sum += i;
        }
        return sum;
    }
}
