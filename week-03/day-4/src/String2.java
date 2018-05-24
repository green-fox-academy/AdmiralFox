public class String2 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.
        String sentence = "xxx films ar the most downloaded films at the xxx.com sites";
        char from = 'x';
        System.out.println(xyChanger(sentence, from));
    }

    private static String xyChanger(String sentence, char from) {
        char first;
        if (sentence.length() < 1) {
            return sentence;
        } else {
            if (from == sentence.charAt(0)) {
                return xyChanger(sentence.substring(1), from);
            } else {
                first = sentence.charAt(0);
            }
            return first + xyChanger(sentence.substring(1), from);
        }
    }
}