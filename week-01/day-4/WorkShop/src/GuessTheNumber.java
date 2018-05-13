import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = 8;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number between 10 and 1: ");
        int userInput = scanner.nextInt();

        if (userInput < number) {
            System.out.println("The stored number is higher");
        } else if (userInput > number) {
            System.out.println("The stored number is lover");
        } else {
            System.out.println("You found the number: " + number);
        }
    }
}
