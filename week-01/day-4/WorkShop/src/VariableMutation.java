public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;

        System.out.println(a);


        int b = 100;
        b -= 7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;

        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= 2;
        System.out.println(e);


        int f1 = 123;
        int f2 = 345;
        boolean bigger = (f1 > f2);
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;
        boolean bigger2 = ((g2 + g2) > g1);
        System.out.println(bigger2);

        int h = 135798745;
        boolean divisor = (h % 11 == 0);
        System.out.println(divisor);

        int i1 = 10;
        int i2 = 3;
        boolean higher = ((i1 > Math.pow(i2, 2)) && (i1 < Math.pow(i2, 3)));
        System.out.println(higher);

        int j = 1521;
        boolean divide = ((j / 3 == 0) || (j / 5 == 0));
        System.out.println(divide);

        String k = "Apple";
        //fill the k variable with its cotnent 4 times


        System.out.println(k);
    }
}
