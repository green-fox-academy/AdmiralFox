import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public class StreamPractice02 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList <>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    String testString = "Cogito Ergo Sum";
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    ArrayList<Integer> numbersFrequency = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    getEvens(numbers);
    getAverageOfOdd(numbers);
    getEvensSquared(numbers);
    getSquaredMoreThan20(numbers2);
    getUppercase(testString);
    getSpecificCityNames(cities);
    getFrequencyOfCharacters(testString);
    getFrequencyOfNumbers(numbersFrequency);

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
  private static void getFrequencyOfCharacters(String testString) {
    System.out.println("getFrequencyOfCharacters: ");
    Map<Character, Integer> frequencies = testString
            .toUpperCase()
            .chars()
            .boxed()
            .collect(toMap(
                    key -> Character.valueOf((char) key.intValue()),
                    value -> 1,
                    Integer::sum));
    System.out.println(frequencies);
  }
  private static void getFrequencyOfNumbers(ArrayList<Integer> numbers) {
    System.out.println("getFrequencyOfCharacters: ");
    Map <Integer, Integer> frequencies = numbers
            .stream()
            .collect(toMap(identity(),
                    value -> 1,
                    Integer::sum));
    System.out.println(frequencies);
  }
}
