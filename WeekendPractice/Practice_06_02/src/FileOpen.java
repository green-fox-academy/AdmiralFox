import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileOpen {
  public static void main(String[] args) {
    Path path = Paths.get("C:\\Users\\krisz\\Greenfox\\AdmiralFox\\WeekendPractice\\Practice_06_02\\content.txt");
    ArrayList<String> offensiveWords = new ArrayList<> (Arrays.asList("fuck", "bloody", "cock", "shit", "fucker",
            "fuckstick", "asshole", "dick", "piss"));


        try {
          List<String> content = Files.readAllLines(path);
          for (int i = 0; i < content.size(); i++) {
            String[] tomb = content.get(i).split(" ");
            for (int j = 0; j < tomb.length; j++) {
              System.out.print(tomb[j] + "/");
            }
            content.removeAll(offensiveWords);
          }
          int howManyWordsRemoved = content.size() - offensiveWords.size();
          System.out.println(howManyWordsRemoved);
    } catch (IOException e) {
          e.printStackTrace();
        }
  }
}
