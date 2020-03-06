import java.util.Scanner;

public class DrawDiamon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number please");
        int startNum = scanner.nextInt();
        int num = (int) java.lang.Math.round(startNum / 2.);
        int white = num - 1;
        int star = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < white; j++) System.out.print(" ");
            for (int j = 0; j < star; j++) System.out.print("*");
            System.out.println("");
            white--;
            star += 2;
        }
        int num2 = startNum / 2;
        white += (1 + (num - num2));
        star -= (2 + (num - num2) * 2);
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < white; j++) System.out.print(" ");
            for (int j = 0; j < star; j++) System.out.print("*");
            System.out.println("");
            white++;
            star -= 2;
        }
    }
}
