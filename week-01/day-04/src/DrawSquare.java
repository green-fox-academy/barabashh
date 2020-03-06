import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number please");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) System.out.print("%");
        System.out.println();
        for (int j = 1; j < num - 1; j++) {
            //draw the first *
            System.out.print("%");
            for (int i = 1; i < num - 1; i++) System.out.print(" ");
            //draw the last *
            System.out.println("%");
        }
        for (int i = 0; i < num; i++) System.out.print("%");
    }
}
