import java.util.ArrayList;
import java.util.Arrays;

public class StreamPractice02 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList <>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    String testString = "Cogito Ergo Sum";
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    getEvens(numbers);
    getAverageOfOdd(numbers);
    getEvensSquared(numbers);
    getSquaredMoreThan20(numbers2);
    getUppercase(testString);
    getSpecificCityNames(cities);

  }
  private static void getEvens(ArrayList<Integer> numbers) {
    System.out.println("getEvens: ");
    numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
  }
  private static void getAverageOfOdd(ArrayList<Integer> numbers) {
    System.out.println("getAverageOfOdd: ");
    numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(n -> n)
            .average()
            .ifPresent(System.out::println);
  }
  private static void getEvensSquared(ArrayList<Integer> numbers) {
    System.out.println("getEvensSquared: ");
    numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(System.out::println);
  }
  private static void getSquaredMoreThan20(ArrayList<Integer> numbers) {
    System.out.println("getSquaredMoreThan20: ");
    numbers.stream()
            .map(n -> n * n)
            .filter(n -> n > 20)
            .forEach(System.out::println);
  }
  private static void getUppercase(String testString) {
    System.out.println("getUppercase: ");
    testString.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char)c))
            .forEach(System.out::println);
  }
  private static void getSpecificCityNames(ArrayList<String> testString) {
    System.out.println("getSpecificCityNames: ");
    testString.stream()
            .filter(s -> s.startsWith("A") && s.endsWith("I"))
            .forEach(System.out::println);
  }
}
