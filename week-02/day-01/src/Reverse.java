import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - i - 1];
        }
        numbers = Arrays.copyOf(reversed, reversed.length);
        System.out.println(Arrays.toString(numbers));
    }
}
