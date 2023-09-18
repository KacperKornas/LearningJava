public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {

//        System.out.println(printYearsAndDays(525600));
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            if (year >= 1){
                long remainingDay = (int) (day % 365) ;
                System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d");
            } else {
                System.out.println(minutes + " min = " + year + " y and " + day + " d");
            }
        }
    }
}
