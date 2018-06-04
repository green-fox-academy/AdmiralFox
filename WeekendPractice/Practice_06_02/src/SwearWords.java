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

    ArrayList<String> offensiveWords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
//    System.out.println(familyFriendlizer("content.txt", offensiveWords)); // should print out 17
    System.out.println(justPrint("content.txt", offensiveWords));
  }

//  private static int familyFriendlizer(String fileName, ArrayList<String> offensiveWords) {
//    Path filePath = Paths.get(fileName);
//    List<String> fileContent = new ArrayList<>();
//
//    try {
//      fileContent = Files.readAllLines(filePath);
//
//
//
//    } catch (IOException exception) {
//      System.out.println("Unable to read file");
//    }
//    return fileContent.size();
//  }

  private static List<String> justPrint(String fileName, ArrayList<String> offensiveWords) {
    Path filePath = Paths.get(fileName);
    List<String> fileContent = new ArrayList<>();
//    remowedWords =

    try {
      fileContent = Files.readAllLines(filePath);
      for (int i = 0; i < fileContent.size(); i++) {
        System.out.println(fileContent.get(i).split(" "));
      }


    } catch (IOException exception) {
      System.out.println("Unable to read file");
    }
    return fileContent;
  }
}



