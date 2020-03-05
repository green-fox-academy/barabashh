import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        System.out.println("Write a number please:");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        if (userInput1 % 2 != 0)
        {
            System.out.println("The number is Odd");
        }
        else
        {
            System.out.println("The number is Even");
        }
    }
}
