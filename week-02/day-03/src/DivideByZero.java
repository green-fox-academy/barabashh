import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        try{
            System.out.println(10 / divisor);
        }
       catch (ArithmeticException e){
           System.out.println("fail");
        }

    }
}
