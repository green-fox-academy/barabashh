import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the desired horizontal size (integer) of your chess table?");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {

            for (int k = 0; k <= 1; k++) {
                if (k == 1) System.out.print(" ");

                for (int j = 0; j < num -1; j++) {
                    System.out.print("% ");
                }
                System.out.println("%");
            }

        }
    }
}
