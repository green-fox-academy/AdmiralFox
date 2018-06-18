import java.util.ArrayList;
import java.util.Arrays;

public class StreamPractice02 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList <>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    getEvens(numbers);
    getAverageOfOdd(numbers);

  }
  private static void getEvens(ArrayList<Integer> numbers) {
    numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
  }
  private static void getAverageOfOdd(ArrayList<Integer> numbers) {
    numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(n -> n)
            .average()
            .ifPresent(System.out::println);
  }
}
