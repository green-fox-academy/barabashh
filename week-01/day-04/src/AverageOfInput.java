import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number please");
        int num1 = scanner.nextInt();
        System.out.println("Second number please");
        int num2 = scanner.nextInt();
        System.out.println("Third number please");
        int num3 = scanner.nextInt();
        System.out.println("Forth number please");
        int num4 = scanner.nextInt();
        System.out.println("Fifth number please");
        int num5 = scanner.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("Sum: " + sum + ", Average: " + sum/5.);
    }
}
