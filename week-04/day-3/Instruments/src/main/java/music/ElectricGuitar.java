package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public String sound() {
    return "Twangg";
  }

  public void play() {
    System.out.println( "Electric Guitar, a " + this.numberOfStrings + "-stringed  instrument that goes " + sound());
  }
}
