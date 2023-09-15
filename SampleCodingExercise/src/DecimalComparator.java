public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1776, -3.178));
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        double roundedFirstNumber = (int) (first * 1000.0) / 1000.0;
        double roundedSecondNumber = (int) (second * 1000.0) / 1000.0;

        if (roundedFirstNumber == roundedSecondNumber) {
            return true;
        }
        return false;
    }
}
