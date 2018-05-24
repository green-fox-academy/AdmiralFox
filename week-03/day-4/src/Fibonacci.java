public class Fibonacci {
    public static void main(String[] args) {
        int number = 8;
        numberAdder(number);
        System.out.println(numberAdder(number));



    }
    public static int numberAdder(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1){
            return 1;
        } else {
            return numberAdder(number-1) + numberAdder(number-2);
        }
    }
}