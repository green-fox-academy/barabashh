package charSequence;

public class Shifter extends CharSequenceBase {

  public Shifter(String string, int numberOfShifting) {
    super();
    super.setCharSequence(shiftString(string,numberOfShifting));

  }

  public String shiftString(String stringInput, int numberOfShifting) {
    int charSequenceLength = stringInput.length();
    StringBuilder sb = new StringBuilder(stringInput);

    for (int i = 0; i < charSequenceLength; i++) {
      sb.setCharAt(i, stringInput.charAt((i + numberOfShifting) % charSequenceLength));
    }
    return sb.toString();
  }
}
