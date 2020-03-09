public class Sum {
    public static void main(String[] args) {
        System.out.println(Sum(4));
    }

    public static int Sum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
