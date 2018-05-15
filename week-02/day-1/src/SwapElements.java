public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

        String[] abc = {"first", "second", "third"};
        change(abc);

        System.out.println(abc[0] + abc[2]);

    }
    public static void change (String abc[]){
        for (int a = 0; a < abc.length; a++) {
            if (abc[0] == "first" && abc[2] == "third") ;
            abc[0] = "abc";
            abc[2] = "abc";
        }
    }
}
