import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeFiles2 {

    public static void main(String[] args) {

        String example = "a,bcd,e,fg";
        String[] solution = splitByLetterBulidIn(example);
        List<String> listSolution = splitByLetter(example, ',');

        System.out.println(Arrays.toString(solution));
        System.out.println(listSolution);
    }

    private static List<String> splitByLetter(String input, char letter) {

        List<String> listOfStings = new ArrayList<>();
        List<Integer> listOfCommaPlaces = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == letter) {
                listOfCommaPlaces.add(i);
            }
        }

        for (int i = 0; i < listOfCommaPlaces.size(); i++) {
            if (i == 0) {
                listOfStings.add(input.substring(i, listOfCommaPlaces.get(i)));
            } else {
                listOfStings.add(input.substring(listOfCommaPlaces.get(i - 1) + 1, listOfCommaPlaces.get(i)));
            }

        }
        return listOfStings;
    }

    public static String[] splitByLetterBulidIn(String input) {
        String[] list = input.split(",");
        return list;
    }

}
