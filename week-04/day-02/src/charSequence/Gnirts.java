package charSequence;

public class Gnirts extends CharSequenceBase {

  public Gnirts(String charSequence) {
    super();
    super.setCharSequence(reverseString(charSequence));
  }

  public String reverseString(String stringInput) {
    int charSequenceLength = stringInput.length();
    StringBuilder sb = new StringBuilder(stringInput);
    for (int i = 0; i < charSequenceLength; i++) {
      sb.setCharAt(i, stringInput.charAt(charSequenceLength - 1 - i));
    }
    return sb.toString();
  }
}
