import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntroduction2 {
    public static void main(String[] args) {
        Map<String, String> products = new HashMap<>();
        products.put("978-1-60309-452-8", "A Letter to Jo");
        products.put("978-1-60309-459-7", "Lupus");
        products.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        products.put("978-1-60309-461-0", "The Lab");
        Set productKeys = products.keySet();
        for (Object productKey : productKeys) {
            String strKey = productKey.toString();
            System.out.println(products.get(strKey) + " (ISBN: " + strKey + ")");
            if (products.get(strKey) == "The Lab") {
                products.remove(strKey);
            }
        }
        products.put("978-1-60309-450-4", "They Called Us Enemy");
        products.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(products.containsKey("478-0-61159-424-8"));
        System.out.println(products.get("978-1-60309-453-5"));
    }
}
