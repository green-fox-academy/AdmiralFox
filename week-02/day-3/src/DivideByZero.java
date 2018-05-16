import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        try {
            int devide = 10 / userInput;
            System.out.println(devide);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}
