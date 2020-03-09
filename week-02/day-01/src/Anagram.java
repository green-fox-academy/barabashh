public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("dog", "god"));
        System.out.println(anagram("green", "fox"));
        System.out.println(anagram("debit card", "bad credit"));
    }

    public static boolean anagram(String inp1, String inp2) {
        if (inp1.length() != inp2.length()) return false;
        for (int i = 0; i < inp1.length(); i++) {
            int j = inp2.indexOf(inp1.charAt(i));
            if (j >= 0) {
                inp2 = inp2.substring(0, j) + inp2.substring(j + 1);
            }
        }
        if (inp2.equals("")) {
            return true;
        } else {
            return false;
        }
    }
}
