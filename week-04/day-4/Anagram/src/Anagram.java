import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
  //  Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
  //  Create a test for that.
  public static boolean isAnagram(String firstText, String secondText) {
    ArrayList<String> compareOne = new ArrayList<>(Arrays.asList(firstText.toLowerCase().split("")));
    ArrayList<String> compareTwo = new ArrayList<>(Arrays.asList(secondText.toLowerCase().split("")));

//    firstText.split("");
//    System.out.println(Arrays.toString(firstText.split("")));
    compareOne.sort(String::compareTo);
    compareTwo.sort(String::compareTo);


    if (compareOne.toString().equals(compareTwo.toString())) {
      return true;
    }
    System.out.println("false");
    return false;
  }

  public static void main(String[] args) {


    Anagram.isAnagram("aBd","aBd");
  }


}
