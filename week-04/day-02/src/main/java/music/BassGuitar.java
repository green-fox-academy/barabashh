package main.java.music;

public class BassGuitar extends StringedInstrument {
  private String sound =  "Duum-duum-duum";

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public BassGuitar() {
    super(4);
  }

  public void sound() {
    System.out.println("Bass Guitar" + super.getSentenceWithStrings() + this.sound);
  }
}
