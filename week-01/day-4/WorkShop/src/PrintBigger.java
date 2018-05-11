import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please type the second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("This is the bigger number: " + number1);
        } else if (number2 > number1) {
            System.out.println("This is the bigger number: " + number2);
        }
    }
}
