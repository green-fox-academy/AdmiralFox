public class Animal {
    public static void main(String[] args) {
        AnimalNeeds bear = new AnimalNeeds();
        System.out.println(bear.thirst);
        System.out.println(bear.hunger);
        bear.eat();
        System.out.println(bear.hunger);
        bear.drink();
        System.out.println(bear.thirst);
        bear.play();
        System.out.println(bear.hunger);
        System.out.println(bear.thirst);
    }
}
