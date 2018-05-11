import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Input forth number: ");
        int num4 = scanner.nextInt();

        System.out.println("Input fifth number: ");
        int num5 = scanner.nextInt();

        int sum = (num1 + num2 + num3 + num4 + num5);
        double average = (sum / 5);

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
