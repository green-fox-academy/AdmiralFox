import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};
        System.out.println(add(ai));


    }
    public static int add (int[] numbers){
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        }
        return a;
    }
}
