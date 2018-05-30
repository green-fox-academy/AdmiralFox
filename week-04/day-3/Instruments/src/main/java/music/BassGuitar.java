package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  public void play() {
    System.out.println( "Bass Guitar, a " + this.numberOfStrings + "-stringed  instrument that goes " + sound());
  }
}
