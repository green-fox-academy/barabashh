import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        System.out.println("What is the distance in miles?");
        Scanner scanner = new Scanner(System.in);
        double userInput1 = scanner.nextDouble();

        System.out.println("Value in kms: " + userInput1 * 1.60934);
    }
}
