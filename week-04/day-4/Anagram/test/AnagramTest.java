import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void anagram_Test_with_two_strings() {
    Anagram text = new Anagram();
    String testTextOne = "cinema";
    String testTextTwo = "iceman";

    assertTrue(text.isAnagram(testTextOne, testTextTwo));
  }

  @Test
  public void anagram_Test_with_Upper_and_Lowercase() {
    Anagram text = new Anagram();
    String testTextOne = "ciNemA";
    String testTextTwo = "IceMan";

    assertTrue(text.isAnagram(testTextOne, testTextTwo));
  }

}