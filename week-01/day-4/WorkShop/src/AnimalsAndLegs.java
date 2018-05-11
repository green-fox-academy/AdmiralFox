import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type here how many chickens you have: ");
                int numberOfTheChickens = scanner.nextInt();
        System.out.println("Please type here how many pigs you have: ");
                int numberOfThePigs = scanner.nextInt();
                int numberOfTheLegs = ((numberOfTheChickens * 2) + (numberOfThePigs * 4));
        System.out.println("All of the animals you have has " + numberOfTheLegs + " legs!");
    }
}
