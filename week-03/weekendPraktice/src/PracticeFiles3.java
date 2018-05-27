import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PracticeFiles3 {
    public static void main(String[] args) {
        Path filePath = Paths.get("weekendPractice.iml");
        Files.isReadable(filePath);
        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.print(lines);
            for (int i = 0; i < lines.size(); i++) {

            }


        } catch (IOException exception) {
            System.out.println("Not Working");
        }
    }
}
