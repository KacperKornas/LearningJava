public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 1900));
        System.out.println(getDaysInMonth(4, 2000));
        System.out.println(getDaysInMonth(2, 1900));
        System.out.println(getDaysInMonth(2, 2000));


    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else if (isLeapYear(year)) {
            int days = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 29;
                default -> 30;
            };
            return days;
        } else {
            int days = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                default -> 30;
            };
            return days;
        }
    }
}



