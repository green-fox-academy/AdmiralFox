public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 3;
        System.out.println(poweROfNumbers(base, power));

    }

    public static int poweROfNumbers(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * poweROfNumbers(base, power-1);
        }
    }
}
