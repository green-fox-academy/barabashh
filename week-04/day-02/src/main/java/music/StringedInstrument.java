package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public abstract void sound();

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public String getSentenceWithStrings(){
    return ", a " + numberOfStrings + "-stringed instrument that goes ";
  }
  @Override
  public void play() {
    sound();
  }
}
