public class Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
         //   System.out.println(reversed.charAt(0));
         //   System.out.println(reversed.length());
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        System.out.println(reverser(reversed));
    }

          public static String reverser(String sentence) {
        for (int i = 0; i < sentence.length(); i++)
            if (sentence.indexOf(0) < sentence.indexOf(81))
                sentence.replace(sentence.charAt(0), sentence.charAt(81));
                return sentence;
            }
        }
