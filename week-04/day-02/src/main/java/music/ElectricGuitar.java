package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  private String sound = "Twang";

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public ElectricGuitar() {
    super(6);
  }

  public void sound() {
    System.out.println("Electric Guitar" + super.getSentenceWithStrings() + this.sound);
  }
}
