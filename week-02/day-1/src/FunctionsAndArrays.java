import java.util.Arrays;

public class FunctionsAndArrays {
    public static void main(String[] args) {
        //Using of arrays
        int[] numbers = new int[4];
        // 4 pieces of null
        String[] texts = new String[4];
        // 4 pieces of false
        boolean[] truth = new boolean[4];
        // két dimenzios tömb olyan tömb amely int tartalmat melyekbe int ek vannak
        int[][] map = new int [10][10];
        int[][] map2 = {
                {1, 2, 3, 4, 5,},
                {1, 2, 3, 4, 5,},
                {1, 2, 3, 4, 5,},
                {1, 2, 3, 4, 5,},
        };




        // ezt nem nagyon használjuk
        Object[] objects = {2, "alma", true};
        Object o = "alma";

        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 8;
        numbers[3] = 4;

        // some of the versions
        int[] numbers2 = {3, 6, 9, 2};
        int[] numbers3;

        numbers3 = new int[] {9, 8 ,7, 6, 4};

        System.out.println(Arrays.toString(numbers));
    }
}
