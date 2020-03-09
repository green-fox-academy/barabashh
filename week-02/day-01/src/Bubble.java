import java.util.Arrays;
import java.util.Collections;

public class Bubble {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubble(new int[]{34, 12, 24, 9, 5})));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[]{34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }

    public static int[] bubble(int[] numbersToSort) {
        Arrays.sort(numbersToSort);
        return numbersToSort;
    }

    public static int[] advancedBubble(int[] numbersToSort, boolean reverse) {
        if (reverse == false) {
            Arrays.sort(numbersToSort);
            return numbersToSort;
        } else {
            Arrays.sort(numbersToSort);
            int[] reversed = new int[numbersToSort.length];
            for (int i = 0; i < numbersToSort.length; i++) {
                reversed[i] = numbersToSort[numbersToSort.length - i - 1];
            }
            numbersToSort = Arrays.copyOf(reversed, reversed.length);
            return numbersToSort;
        }
    }
}
