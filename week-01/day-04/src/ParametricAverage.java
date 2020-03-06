import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers shall I ask for?");
        int n = scanner.nextInt();
        System.out.println("OK, please enter the numbers now:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
                sum += scanner.nextInt();
        }
        System.out.print("Sum: " + sum);
        System.out.println(", Average: " + sum / n);
    }
}
