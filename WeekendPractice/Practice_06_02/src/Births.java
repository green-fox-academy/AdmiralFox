import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Births {

  public static void main(String[] args) {
    String fileName = "C:\\Users\\krisz\\Greenfox\\AdmiralFox\\WeekendPractice\\Practice_06_02\\births.csv";
    System.out.println(findBiggestValue(getAges(readFileContent(fileName))));
  }

  public static List <String> readFileContent(String filePath) {
    List <String> fileRows = new ArrayList <>();
    try {
      fileRows = Files.readAllLines(Paths.get(filePath));
    } catch (IOException e) {
      System.out.println("Unable to read file.");
    }
    return fileRows;
  }

  public static List <Integer> getAges(List <String> fileContent) {
    List <Integer> ages = new ArrayList <>();
    for (String row : fileContent) {
      ages.add(Integer.parseInt(row.split("[;\\-]")[1]));
    }
    return ages;
  }

  private static HashMap <Integer, Integer> transformToHashMap(List <Integer> ages) {
    HashMap <Integer, Integer> birthDateCounter = new HashMap <>();
    for (int yearDate : ages) {
      birthDateCounter.merge(yearDate, 1, Integer::sum);
    }
    return birthDateCounter;
  }


  public static Integer findBiggestValue(List <Integer> ages) {
    int currentMax = 0;
    int currentKey = 0;
    for (Integer key : ages) {
      if (transformToHashMap(ages).get(key) > currentMax) {
        currentMax = transformToHashMap(ages).get(key);
        currentKey = key;
      }
    }
    return currentKey;
  }
}