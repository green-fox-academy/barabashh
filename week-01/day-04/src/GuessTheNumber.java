import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNum = 231;
        int usrNum;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What is your guess?");
            usrNum = scanner.nextInt();
            if (storedNum > usrNum) {
                System.out.println("The stored number is higher");
            }
            else if (storedNum < usrNum) {
                System.out.println(" The stored number is lower");
            }
            else if (storedNum == usrNum) {
                System.out.println("You have found the number: " + storedNum);
            }
        } while (storedNum != usrNum);
    }
}
