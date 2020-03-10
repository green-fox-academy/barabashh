import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String name : names) {
            System.out.println(name);
        }
        int i = 1;
        for (String name : names) {
            System.out.println(i + ". " + name);
            i++;
        }
        names.remove(1);
        for (int j = names.size() - 1; j >= 0; j--) {
            System.out.println(names.get(j));
        }
        names.clear();
    }
}
