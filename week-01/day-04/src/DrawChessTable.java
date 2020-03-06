import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the desired horizontal size (integer) of your chess table?");
        int num = 6;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num -1; j++) {
                System.out.print("% ");
            }
            System.out.println("%");
            System.out.print(" ");
            for (int j = 0; j < num -1; j++) {
                System.out.print("% ");
            }
            System.out.println("%");
        }
    }
}
