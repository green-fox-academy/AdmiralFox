public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remainingTime = (currentHours * 60) * 60;
        int remainingMinutes = (currentMinutes * 60);
        int remainingSeconds = (((86400 - remainingTime) - remainingMinutes) - currentSeconds);

        System.out.println("Remaining seconds of the day: " + remainingSeconds);
    }
}
