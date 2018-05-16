import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

        String path = "my-file.txt";
        String world = "apple";
        int number = 5;
        threeParameters(path, world, number);
        //System.out.println(threeParameters(path, world));

    }
    public static void threeParameters (String path, String world, int number) {
        Path myFile = Paths.get(path);
        try {
            List<String> content = new ArrayList<>();
            for (int i = 0; i <= number; i++) {
                content.add(i, world);
            }
            Files.write(myFile, content);
            System.out.println("done");


        } catch (Exception e) {
            System.out.println("not working");
        }
    }
}

