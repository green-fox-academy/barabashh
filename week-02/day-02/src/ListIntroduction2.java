import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA =
                new ArrayList<String>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> listB =
                new ArrayList<String>(listA);
        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        listA.add(4, "Kiwifruit");
        System.out.println(listA.size() == listB.size());
        System.out.println(listA.indexOf("Avocado"));
        if (listB.indexOf("Durian") >= 0) {
            System.out.println(listB.indexOf("Durian"));
        } else {
            System.out.println("\"Durian\" is not present in listB");
        }
        //listB.add(Arrays.asList("Passion Fruit", "wood"));
        listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(listA.get(2));
    }
}
