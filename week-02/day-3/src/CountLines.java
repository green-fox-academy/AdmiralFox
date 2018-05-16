import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountLines {
    public static void main(String[] args) {
        String fileName = "my-file.txt";
        linesCount(fileName);
        System.out.println(linesCount(fileName));
    }

    public static int linesCount(String linesMyFile) {
        Path path = Paths.get(linesMyFile);
        try {
            List<String> lines = Files.readAllLines(path);
           return lines.size();

        } catch (Exception e){
            return 0;
        }

    }
}
        /*
        try {
            List<String> filePath = Files.readAllLines(path);
                long lineCount = Files.lines(path).count();
                System.out.println(lineCount);
            } catch (IOException e) {
            System.out.println("Can't open the file");
        }
        */


