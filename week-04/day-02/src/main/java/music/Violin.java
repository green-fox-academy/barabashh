package main.java.music;

public class Violin extends StringedInstrument {
  private String sound = "Screech";

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
  }

  public Violin() {
    super(4);
  }

  public void sound() {
    System.out.println("Violin" + super.getSentenceWithStrings() + this.sound);
  }
}
