import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number please");
        int startNum = scanner.nextInt();
        int num = startNum / 2;
        int white = num - 1;
        int star = 1;
        for (int i = 0; i < num; i++) {
            if (startNum % 2 != 0) System.out.print(" ");
            for (int j = 0; j < white; j++) System.out.print(" ");
            for (int j = 0; j < star -1; j++) System.out.print("*");
            System.out.println("*");
            white--;
            star+=2;
        }
        if (startNum % 2 != 0)
        {
            //we need to draw an extra line into the middle if StartNumber is odd
            for (int j = 0; j < star - 1; j++) System.out.print("*");
            System.out.println("*");
        }
        white++;
        star-=2;
        for (int i = 0; i < num; i++) {
            if (startNum % 2 != 0) System.out.print(" ");
            for (int j = 0; j < white; j++) System.out.print(" ");
            for (int j = 0; j < star -1; j++) System.out.print("*");
            System.out.println("*");
            white++;
            star-=2;
        }
    }

}
