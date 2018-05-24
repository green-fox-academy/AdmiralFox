public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
        int number = 240;
        int startingPosition = 1;
        numberAdder(number,startingPosition);


    }
    public static int numberAdder(int number, int start) {
        if (start == number ) {
            return number;
        } else {
            System.out.println(start);
            return  numberAdder(number,start + 1);
        }
    }
}
