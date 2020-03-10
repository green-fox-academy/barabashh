import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TelephoneBook {
    public static void main(String[] args) {
        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("William A. Lathan","405-709-1865");
        phoneBook.put("John K. Miller","402-247-8568");
        phoneBook.put("Hortensia E. Foster","606-481-6467");
        phoneBook.put("Amanda D. Newland","319-243-5613");
        phoneBook.put("Brooke P. Askew","307-687-2982");

        System.out.println(phoneBook.get("John K. Miller"));
        Set names = phoneBook.keySet();
        for (Object objName : names) {
            String strName = objName.toString();
            if (phoneBook.get(strName) == "307-687-2982") {
                System.out.println(strName);
            }
        }
        System.out.println(phoneBook.containsKey("Chris E. Myers'"));  //Nope, we don't.
    }
}
