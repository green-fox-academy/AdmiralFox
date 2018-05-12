import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add zour first number here: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please add zour second number here: ");
        int secondNumber = scanner.nextInt();
        if (secondNumber < firstNumber) {
            System.out.println("The second number should be bigger");
        } else {
            for (int a = firstNumber; a < secondNumber; a++) {
                System.out.println(a);
            }
        }

    }
}
