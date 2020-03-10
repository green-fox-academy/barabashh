import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> expenses = new ArrayList<Integer>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (Integer n : expenses) {
            sum += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("spending: " + sum);
        System.out.println("greatest expense: " + max);
        System.out.println("cheapest spending: " + min);
        System.out.println("average amount of our spending: " + sum / (expenses.size()));
    }
}
