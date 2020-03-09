public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println(palindromeBuilder("greenfox"));
        System.out.println(palindromeBuilder("123"));
    }
    public static String palindromeBuilder(String str)
    {
        for (int i = str.length() - 1; i >= 0; i--) {
            str += str.charAt(i);
        }
        return str;
    }
}

