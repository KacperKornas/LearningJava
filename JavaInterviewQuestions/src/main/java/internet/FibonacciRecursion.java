package internet;

public class FibonacciRecursion {
    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0; But is: " + n);
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        try {
            System.out.println(fib(1));
            System.out.println(fib(9));
            System.out.println(fib(20));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
