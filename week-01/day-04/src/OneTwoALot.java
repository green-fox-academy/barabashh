import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        System.out.println("Write a number please:");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        if (userInput1 <= 0)
        {
            System.out.println("Not enough");
        }
        else if (userInput1 == 1)
        {
            System.out.println("One");
        }
        else if (userInput1 == 2)
        {
            System.out.println("Two");
        }
        else if (userInput1 > 2)
        {
            System.out.println("A lot");
        }
    }
}
