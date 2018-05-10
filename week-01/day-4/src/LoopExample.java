import java.util.Scanner;

public class LoopExample {
    // hungerCounter++;
    //++hungerCounter;
    //hungerCounter = hungerCounter +1;
    //hungerCounter += 3;
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please give a number");
        int hungerCounter = userInput.nextInt();

        while (hungerCounter > 0) {
            hungerCounter--;
            System.out.println("Éhes vagyok");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
    }

}
