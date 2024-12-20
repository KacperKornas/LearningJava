public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(8));
        System.out.println(getLargestPrime(17));
        System.out.println(getLargestPrime(300));


    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }

        int largestPrime = -1;

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }
        return largestPrime;
    }
}
