import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>(
                Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
        System.out.println(shoppingList.contains("milk"));
        System.out.println(shoppingList.contains("banana"));
    }
}
