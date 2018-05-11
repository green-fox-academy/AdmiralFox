import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your Km data: ");
        int userInputKm = scanner.nextInt();
        double kmToMile = (userInputKm / 0.62);
        System.out.println("This is your Km data in miles is: " + kmToMile);
    }
}
