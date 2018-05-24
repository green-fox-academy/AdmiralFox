public class Bunny1 {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        int bunny = 32;
        System.out.println(bunnyEarsCounter(bunny));


    }
    public static int bunnyEarsCounter(int bunny) {
        if (bunny == 0) {
            return 0;
        } else {
            return  2 + bunnyEarsCounter(bunny-1);
        }
    }
}
