import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
      //  String fileName = "my-file.txt";
        Path filePath = Paths.get("my-file.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }

        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
