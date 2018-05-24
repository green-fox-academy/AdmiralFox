public class Bunny2 {
    public static void main(String[] args) {
        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
        int bunny = 32;
        System.out.println(bunnyEarsCounter(bunny));

    }
    public static int bunnyEarsCounter(int bunny) {
        if (bunny == 0) {
            return 0;
        } else if (bunny % 2 == 0) {
            return  3 + bunnyEarsCounter(bunny-1);
        } else {
            return  2 + bunnyEarsCounter(bunny-1);
        }
    }
}