import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number please:");
        int firstNum = scanner.nextInt();
        System.out.println("Second number please:");
        int secondNum = scanner.nextInt();

        if (secondNum > firstNum)
        {
            int i = firstNum;
            while (i < secondNum)
            {
                System.out.println(i);
                i++;
            }
        }
        else
        {
            System.out.println("The second number should be bigger");
        }


    }
}
