import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number please");
        int num = scanner.nextInt();

        int c1 = num - 1;
        int c2 = 1;
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < c1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < c2 -1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
            c1--;
            c2 +=2;
        }
    }
}
