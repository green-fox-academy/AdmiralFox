import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please ad your number for multiplication: ");
        int userInput = scanner.nextInt();

        for (int a = 0; a < 10; a++) {
            System.out.println((a + 1) + " * " + userInput + " = " + ((userInput * (a + 1))));
        }
        System.out.println("Multiplication ends!");
    }
}
