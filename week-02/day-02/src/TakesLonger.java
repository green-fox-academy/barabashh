public class TakesLonger {
    public static void main(String[] args) {
        StringBuilder sb =
                new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        sb = sb.insert(20, " always takes longer than");
        System.out.println(sb);
    }
}
