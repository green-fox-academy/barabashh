import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static ArrayList<Integer> subInt(int num, int[] arrayToSearch) {
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for (int i = 0; i < arrayToSearch.length; i++) {
            if (Integer.toString(arrayToSearch[i]).contains(Integer.toString(num))) {
                indices.add(i);
            }
        }
        return indices;
    }
}
