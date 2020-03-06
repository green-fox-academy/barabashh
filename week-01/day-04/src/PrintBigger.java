import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number please");
        int num1 = scanner.nextInt();
        System.out.println("Second number please");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);
        }
    }
}
