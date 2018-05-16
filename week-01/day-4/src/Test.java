public class Test {
    public static void main(String[] args) {
        for (int a = 0; a < 5; a++) {
            for (int b = 5; b > a; b--) {
                System.out.print(" ");
            }
            for (int b = 1; b < a * 2; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
