package main.java.music;

public class Violin extends StringedInstrument {


  public Violin() {
    numberOfStrings = 4;
  }

  @Override
  public String sound() {
    return "Screech";
  }

  public void play() {
    System.out.println("Violin, a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
