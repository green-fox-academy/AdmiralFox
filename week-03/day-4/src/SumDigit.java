public class SumDigit {
    public static void main(String[] args) {
        int number = 234;
        int numberSum = sumDigitTool(number);
        System.out.println(numberSum);

    }
    public static int sumDigitTool(int number) {
        if (number == 0) {
            return 0;
        } else
            return  (number % 10) + sumDigitTool(number/10);

    }
}
