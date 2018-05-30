package main.java.music;

public abstract class StringedInstrument extends Instrument {

  public int numberOfStrings;

  public StringedInstrument() {
  }

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public abstract String sound();

  public abstract void play();
}
