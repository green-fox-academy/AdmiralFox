import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many girls coming to the party: ");
        int number1 = scanner.nextInt();
        System.out.println("How many boys coming to the party: ");
        int number2 = scanner.nextInt();

        boolean equals = (number1 == number2);
        boolean greater = ((number1 + number2) > 20);
        boolean oneToOne = ((number1 % number2) != 0);
        boolean lessThan = ((number1 + number2) < 20);
        boolean noGirls = (number1 == 0);

        if (noGirls) {
            System.out.println("Sausage party");
        } else if (equals && greater) {
            System.out.println("The party is excellent!");
        } else if (greater && oneToOne) {
            System.out.println("Quite cool party!");
        } else (lessThan) {
            System.out.println("Average party...");
        }

    }
}
