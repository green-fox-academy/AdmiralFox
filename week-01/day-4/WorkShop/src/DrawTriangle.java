public class DrawTriangle {
    public static void main(String[] args) {

        int triangle = 4;

        for (int a = 0; a < triangle; a++) {
            for (int b = 0; b < triangle; b++) {
                if (b <= a) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}
