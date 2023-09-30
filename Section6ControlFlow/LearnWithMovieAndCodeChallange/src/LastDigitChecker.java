public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(41, 22, 73));
        System.out.println(isValid(10));
        System.out.println(isValid(9));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10) || (x > 1000) || (y < 10) || (y > 1000) || (z < 10) || (z > 1000)) {
            return false;
        }
        return (x % 10 == y % 10) || (x % 10 == z % 10) || (y % 10 == z % 10);
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
