import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductDatabase2 {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("Eggs", 200);
        productMap.put("Milk", 200);
        productMap.put("Fish", 400);
        productMap.put("Apples", 150);
        productMap.put("Bread", 50);
        productMap.put("Chicken", 550);
        int currentPrice = 0;

        Set productNames = productMap.keySet();
        for (Object objProdName : productNames) {
            String strProdName = objProdName.toString();
            currentPrice = productMap.get(strProdName);
            if (currentPrice < 201) System.out.println(strProdName);
        }
        for (Object objProdName : productNames) {
            String strProdName = objProdName.toString();
            currentPrice = productMap.get(strProdName);
            if (currentPrice > 150) System.out.println("Product: " + strProdName + " - Price: " + currentPrice);
        }
    }
}

