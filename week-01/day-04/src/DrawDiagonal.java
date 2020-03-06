import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number please (num of vertical lines in the diagonal):");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("%");
        }
        System.out.println();
        for (int j = 1; j < num - 1; j++) {
            //draw the first *
            System.out.print("%");
            for (int i = 1; i < num - 1; i++) {
                if (i == j)
                {
                    System.out.print("%");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //draw the last *
            System.out.println("%");
        }
        for (int i = 0; i < num; i++) {
            System.out.print("%");
        }
    }
}
