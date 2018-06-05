import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileOpen {

  public static void main(String[] args) {

    Path path = Paths.get("C:\\Users\\krisz\\Greenfox\\AdmiralFox\\WeekendPractice\\Practice_06_02\\content.txt");
    List<String> fileContetent = new ArrayList<>();
    String[] content = new String[fileContetent.size()];

    System.out.println(content);

    try {
      fileContetent = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("Can not read file!");
    }
    for (int i = 0; i <fileContetent.size() ; i++) {
      content = fileContetent.get(i).split(" ");
    }
  }
}
