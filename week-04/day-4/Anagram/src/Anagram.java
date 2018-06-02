import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
  public static boolean isAnagram(String firstText, String secondText) {
    ArrayList<String> compareOne = new ArrayList<>(Arrays.asList(firstText.toLowerCase().split("")));
    ArrayList<String> compareTwo = new ArrayList<>(Arrays.asList(secondText.toLowerCase().split("")));

    compareOne.sort(String::compareTo);
    compareTwo.sort(String::compareTo);


    if (compareOne.toString().equals(compareTwo.toString())) {
      System.out.println("true");
      return true;
    }
    System.out.println("false");
    return false;
  }
}
