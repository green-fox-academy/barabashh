import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingList2 {
    public static void main(String[] args) {
        Map<String, Float> products = new HashMap<>();
        products.put("Milk", 1.07f);
        products.put("Rice", 1.59f);
        products.put("Eggs", 3.14f);
        products.put("Cheese", 12.60f);
        products.put("Chicken Breasts", 9.40f);
        products.put("Apples", 2.31f);
        products.put("Tomato", 2.58f);
        products.put("Potato", 1.75f);
        products.put("Onion", 1.10f);

        Map<String, Integer> shoppingBob = new HashMap<>();
        shoppingBob.put("Milk", 3);
        shoppingBob.put("Rice", 2);
        shoppingBob.put("Eggs", 2);
        shoppingBob.put("Cheese", 1);
        shoppingBob.put("Chicken Breasts", 4);
        shoppingBob.put("Apples", 1);
        shoppingBob.put("Tomato", 2);
        shoppingBob.put("Potato", 1);

        Map<String, Integer> shoppingAlice = new HashMap<>();
        shoppingAlice.put("Rice", 1);
        shoppingAlice.put("Eggs", 5);
        shoppingAlice.put("Chicken Breasts", 2);
        shoppingAlice.put("Apples", 1);
        shoppingAlice.put("Tomato", 10);

        float spendingBob = 0;
        int itemAmountBob = 0;
        Set shoppingListKeysForBob = shoppingBob.keySet();
        for (Object item : shoppingListKeysForBob) {
            //price X amount
            spendingBob += products.get(item) * shoppingBob.get(item);
            itemAmountBob += shoppingBob.get(item);
        }
        System.out.println("Bob pays: " + spendingBob);

        float spendingAlice = 0;
        int itemAmountAlice = 0;
        Set shoppingListKeysForAlice = shoppingAlice.keySet();
        for (Object item : shoppingListKeysForAlice) {
            //price X amount
            spendingAlice += products.get(item) * shoppingAlice.get(item);
            itemAmountAlice += shoppingAlice.get(item);
        }
        System.out.println("Alice pays: " + spendingAlice);
        if (shoppingBob.get("Rice") > shoppingAlice.get("Rice")) System.out.println("Bob buys more rice");
        if (shoppingBob.get("Potato") > (shoppingAlice.containsKey("Potato") ? shoppingAlice.get("Potato") : 0))
            System.out.println("Bob buys more potato");
        if(shoppingListKeysForBob.size() > shoppingListKeysForAlice.size())
            System.out.println("Bob buys more different products");
        if(itemAmountAlice > itemAmountBob)
            System.out.println("Alice buys more products");
    }
}
