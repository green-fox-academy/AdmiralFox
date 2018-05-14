public class FunctionsExamples {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        float average = avarage(numbers);
        System.out.println(average);

        int n = 3;
        n = increaseNumber(n);
        System.out.println(n);

        //helloUser( userName:"Pisti");
        {
          //  public static void helloUser(String userName) {
          //  System.out.println("Hello " + userName);
        }


        }


       // System.out.println(increaseNumber( number: 2));



    public static int increaseNumber(int number) {
       return number +1;
    }
    public static float avarage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / (float)numbers.length; //kasztolunk hogy tört szám jöjjön ki
    }
}
