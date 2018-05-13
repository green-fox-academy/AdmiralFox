public class DrawDiamond {
    public static void main(String[] args) {
        for (int raw = 1; raw <= 4; raw++)
        {
            for (int column = raw; column < 4; column++)
                System.out.print(" ");
            for (int star = 1; star < (raw * 2); star++)
                System.out.print("*");
            System.out.println();
        }
        for (int raw = 2; raw <= 3; raw++)
        {
            for (int column = 2; column < 3; column++)
                System.out.print(" ");
            for (int star = 0; star <= (raw * 2); star++)
                if (raw < 3) {
                    System.out.print("*");
                } else if (raw == 3) {
                    for (int column = 2; column <= 2; column++)
                        System.out.print(" ");
                } else {
                    for (int column = 2; column < 3; column++)
                        System.out.print("*");
                }
            System.out.println();

        }
    }
}
