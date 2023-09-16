public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        getDurationString(124453);
        getDurationString(600, 50);

    }

    public static void getDurationString(int seconds) {
        if (seconds >= 0) {
            int calculateMinutes = seconds / 60;
            int calculateSeconds = seconds % 60;
            getDurationString(calculateMinutes, calculateSeconds);
        } else {
            System.out.println("The value is too small.");
        }
    }

    public static void getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)) {
            int allSeconds = minutes * 60 + seconds;
            int hours = allSeconds / 3600;
            int restMinutes = (allSeconds % 3600) / 60;
            int restSeconds = (allSeconds % 3600) % 60;

            System.out.println(hours + "h " + restMinutes + "m " + restSeconds + "s ");
        } else {
            System.out.println("Invalid value");
        }
    }
}
