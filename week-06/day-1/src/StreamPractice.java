import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamPractice {
  public static void main(String[] args) {

    ArrayList <Integer> numbers = new ArrayList <>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::print);

    numbers1.stream()
            .

  }
}
