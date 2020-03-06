import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        int numChickens = scanner.nextInt();
        System.out.println("How many pigs do you have?");
        int numPigs = scanner.nextInt();
        System.out.println("Your animals have " + (numChickens * 2 + numPigs * 4) + " legs altogether.");

    }
}
