public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(toBeReversed));
    }
    public static String reverse(String strToBeReversed)
    {
        String returnMe = "";
        for (int i = strToBeReversed.length() - 1; i >= 0; i--) {
            returnMe += strToBeReversed.charAt(i);
        }
        return returnMe;
    }
}
