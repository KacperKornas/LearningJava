public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(100));
    }

    public static boolean isLeapYear(int year) {
        int fourLeapYear = year % 4;
        int hundredLeapYear = year % 100;
        int fourHundredLeapYear = year % 400;
        if ((year >= 1) && (year <= 9999)) {
            if ((hundredLeapYear == 0) && (fourLeapYear == 0) && (fourHundredLeapYear == 0)) {
                return true;
            } else if ((hundredLeapYear == 0) && (fourLeapYear == 0)) {
                return false;
            } else if (fourLeapYear == 0) {
                return true;
            }
        }
        return false;
    }
}


//    public static boolean isLeapYear(int year) {
//        if ((year >= 1) && (year <= 9999)) {
//            int fourLeapYear = year % 4;
//            if (fourLeapYear == 0){
//                int hundredLeapYear = year % 100;
//                if ((hundredLeapYear == 0) && (fourLeapYear == 0)) {
//                    int fourHundredLeapYear = year % 400;
//                    if ((hundredLeapYear == 0) && (fourLeapYear == 0) && (fourHundredLeapYear == 0)) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//}