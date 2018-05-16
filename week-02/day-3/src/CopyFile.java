import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        String fileto = "File-1.txt";
        String filefrom = "File-2.txt";
        copyFiles(fileto, filefrom);
        System.out.println(copyFiles(fileto, filefrom));

    }
    public static boolean copyFiles (String fileto, String filefrom) {
        Path path = Paths.get(fileto);
        Path path1 = Paths.get(filefrom);
        try {
            List<String> lines = Files.readAllLines(path1);
            Files.write(path, lines);
        return true;

        } catch (Exception e) {
            System.out.println("Not successful");
         return false;
        }


    }
}
