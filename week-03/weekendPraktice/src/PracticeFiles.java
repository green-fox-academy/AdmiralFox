import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PracticeFiles {
    public static void main(String[] args) {
        Path path = Paths.get("log.txt");
        try {
            List<String> list = Files.readAllLines(path);
            ArrayList<String> newList = ipCheck(list);

            for (int i = 0; i < newList.size(); i++) {
                System.out.println(newList.get(i));
            }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static ArrayList ipCheck(List list) {
        ArrayList<String> listUpdate = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                String lines = (String) list.get(i);
                String[] linesTwo = lines.split("   ");
                if (listUpdate.contains(linesTwo[1])) {
            } else {
                    listUpdate.add(linesTwo[1]);
                }
            } return listUpdate;
    }
}
