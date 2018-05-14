public class SumElements {
    public static void main(String[] args) {
        int[] r = {54, 23, 66, 12};
        // - Print the sum of the second and the third element
        int sum = r[2] + r[3];
        System.out.println(sum);
        System.out.println(sum(r));
    }
        // - Other method
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 2; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}

