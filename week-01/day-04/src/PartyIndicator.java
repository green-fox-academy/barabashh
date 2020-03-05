import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of girls please:");
        int girls = scanner.nextInt();
        System.out.println("Number of boys please:");
        int boys = scanner.nextInt();
        if (girls == boys && (girls + boys) >= 20)
        {
            System.out.println("The party is excellent!");
        }
        else if (girls == 0)
        {
            System.out.println("Sausage party");
        }
        else if ((girls + boys) >= 20)
        {
            System.out.println("Quite cool party!");
        }
        else if ((girls + boys) < 20)
        {
            System.out.println("Average party...");
        }

    }
}
