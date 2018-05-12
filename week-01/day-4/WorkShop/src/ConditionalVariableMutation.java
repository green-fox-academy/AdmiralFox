public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;

        if (a % 2 == 0) {
            out ++;
        }
        System.out.println(out);

        int b = 13;
        String out2 = "";
        if (b < 20 && b > 10) {
            out2 = "Sweet!";
        } else if (b < 10) {
            out2 = "Less";
        } else {
            out2 = "More";
        }
        System.out.println(out2);


        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if ((credits >= 50) && isBonus == false) {
            c -= 2;
            System.out.println(c);
        } else if ((credits < 50) && isBonus == false) {
            c --;
            System.out.println(c);
        } else {
            System.out.println(c);
        }

        int d = 9;
        int time = 80;
        String out3 = "";

        if ((d % 4 == 0) && time < 200) {
            out3 = "check";
        } else if (time > 200) {
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }

        System.out.println(out3);
    }
}
