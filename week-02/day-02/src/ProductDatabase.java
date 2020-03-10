import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductDatabase {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("Eggs", 200);
        productMap.put("Milk", 200);
        productMap.put("Fish", 400);
        productMap.put("Apples", 150);
        productMap.put("Bread", 50);
        productMap.put("Chicken", 550);
        System.out.println("The fish costs: " + productMap.get("Fish"));
        int max = 0;
        int currentPrice = 0;
        int sum = 0;
        int n = productMap.size();
        int priceBelow300 = 0;
        Boolean buyForExactly125 = false;
        int min = Integer.MAX_VALUE;

        Set productNames = productMap.keySet();
        for (Object objProdName : productNames) {
            String strProdName = objProdName.toString();
            currentPrice = productMap.get(strProdName);
            sum += currentPrice;
            if (currentPrice > max) max = currentPrice;
            if (currentPrice < min) min = currentPrice;
            if (currentPrice < 300) priceBelow300++;
            if (currentPrice == 125) buyForExactly125 = true;
        }
        System.out.println("Average price: " + sum / n);
        System.out.println("Products with prices below 300: " + priceBelow300);
        System.out.println("Something we can buy for exactly 125: " + buyForExactly125);
        for (Object objProdName : productNames) {
            String strProdName = objProdName.toString();
            currentPrice = productMap.get(strProdName);
            if (currentPrice == max) System.out.println("The most expensive product: " + strProdName);
            if (currentPrice == min) System.out.println("The cheapest product: " + strProdName);
        }
    }
}
