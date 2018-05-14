public class Factorio {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(factorio(numbers));
    }

    public static int factorio(int[] facts) {
        int factyro = 1;
        for (int i = 0; i < facts.length; i++) {
            factyro *= facts[i];
        }
        return factyro;
    }
}
