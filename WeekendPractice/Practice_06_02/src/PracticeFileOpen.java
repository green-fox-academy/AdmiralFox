import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PracticeFileOpen {
  public static void main(String[] args) {

    ArrayList<String> offensiveWords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker",
            "fuckstick", "asshole", "dick", "piss"));
    System.out.println(familyFriendlizer("content.txt", offensiveWords));

  }

  public static int familyFriendlizer(String filename, ArrayList<String> offensiveWords) {
    Path path = Paths.get(filename);
    int number = 0;
    try {
      List<String> content = Files.readAllLines(path);
      ArrayList<String> contentAfter = new ArrayList <>();

      for (String line : content) {
        String[] words = line.split("[ \\,\\.]");
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        wordList.removeAll(offensiveWords);
        contentAfter.add(wordList.get(0));
        for (String elements : wordList) {
          System.out.print(elements + "//");
        }
        number = (words.length - wordList.size());
        System.out.println(number);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return number;
  }
}
