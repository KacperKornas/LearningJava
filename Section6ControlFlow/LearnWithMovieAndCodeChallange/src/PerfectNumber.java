public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(7));
        System.out.println(isPerfectNumber(8));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sumDivisors = 0;

        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                sumDivisors += i;
            }
        }
        return sumDivisors == number;
    }
}
