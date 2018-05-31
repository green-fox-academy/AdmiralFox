import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
  //  Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
  //  Create a test for that.
  public static boolean isAnagram(String firstText, String secondText) {
    ArrayList<String> compareOne = new ArrayList<>(Arrays.asList(firstText.split("")));
    ArrayList<String> compareTwo = new ArrayList<>(Arrays.asList(secondText.split("")));

    compareOne.sort(String::compareTo);
    compareTwo.sort(String::compareTo);


    if (compareOne.toString().equals(compareTwo.toString())) {
      System.out.println(compareOne.toString());
      System.out.println(compareTwo.toString());
      System.out.println("true");
      return true;
    }
    System.out.println("false");
    return false;
  }
  public static void main(String[] args) {

    Anagram.isAnagram("cinema","iceman");

  }
}
