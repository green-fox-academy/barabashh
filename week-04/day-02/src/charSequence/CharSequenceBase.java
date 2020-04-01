package charSequence;

public class CharSequenceBase implements CharSequence {
  private String charSequence;

  public void setCharSequence(String charSequence) {
    this.charSequence = charSequence;
  }

  @Override
  public int length() {
    return charSequence.length();
  }

  @Override
  public char charAt(int index) {
    return charSequence.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return this.charSequence.subSequence(start, end);
  }
}