public class CodingHours {
    public static void main(String[] args) {
        //FirstTry
        //int a = (17*5*6);
        //System.out.println(a);
        //System.out.println(52 / a * 100);

        float semesterWeeks = 17;
        float dailyCodes = 6;
        float workDay = 5;
        float workHoursWeekly = 52;
        float semesterCodingHours = semesterWeeks * dailyCodes * workDay;
        float percentageOfTheCodingHours = workHoursWeekly / semesterCodingHours * 100;

        System.out.println(semesterCodingHours);
        System.out.println(percentageOfTheCodingHours);
    }
}