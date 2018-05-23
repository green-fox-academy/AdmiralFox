public class AnimalNeeds {

    static int defaultValue = 50;

    int hunger;
    int thirst;

    public AnimalNeeds() {
        this.hunger = defaultValue;
        this.thirst = defaultValue;
    }

    public void eat() {
        this.hunger--;
    }
    public void drink() {
        this.thirst--;
    }
    public  void play() {
        this.hunger++;
        this.thirst++;
    }
}
