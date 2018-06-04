import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

  public static void main(String[] args) {
    // There is a not so family friendly text in the `content.txt`
    // Create a function named familyFriendlizer that takes a filename and a list of strings as parameters
    // and remove all the given words from the file and returns the amount of the removed words.

    ArrayList<String> offensiveWords = new ArrayList<> (Arrays.asList("fuck", "bloody", "cock", "shit", "fucker",
            "fuckstick", "asshole", "dick", "piss"));
    System.out.println(familyFriendlizer("content.txt", offensiveWords)); // should print out 17
  }

  public static int familyFriendlizer(String filename, ArrayList<String > offensiveWords) {
    int removed = 0;
    List<String> contentLines = new ArrayList<>();
    String[] contentWords;
    String line = "";
    Path filePath = Paths.get(filename);

    try {
      contentLines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Can not read file!");
    }

    for (int i = 0; i < contentLines.size(); i++) {
      contentWords = contentLines.get(i).split(" ");
      for (int j = 0; j < contentWords.length; j++) {
        for (int k = 0; k < offensiveWords.size(); k++) {
          if (contentWords[j].toLowerCase().replace(",", "").replace(".", "")
                  .equals(offensiveWords.get(k))) {
            contentWords[j] = "";
            removed++;
          }
        }
        line = line + contentWords[j] + " ";
      }
      contentLines.remove(i);
      contentLines.add(i, line);
      line = "";
    }

    try {
      Files.write(filePath, contentLines);
    } catch (IOException e) {
      System.out.println("Can not write file!");
    }

    return removed;
  }
}

