public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.
        String sentence = "xxx films ar the most downloaded films at the xxx.com sites";
        char from = 'x';
        char to = 'y';
        System.out.println(xyChanger(sentence, from, to));
    }

    private static String xyChanger(String sentence, char from, char to) {
        char first;
        if (sentence.length() < 1) {
            return sentence;
        } else {
            if (from == sentence.charAt(0)) {
                first = to;
            } else {
                first = sentence.charAt(0);
            }
            return first + xyChanger(sentence.substring(1), from, to);
        }
    }
}