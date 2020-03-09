import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static ArrayList<Integer> unique(int[] arrayToDedupe) {
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        for (int n : arrayToDedupe) {
            if (uniqueList.contains(n) == false)
            {
                uniqueList.add(n);
            }
        }
        return uniqueList;
    }
}
