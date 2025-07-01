package internet;

public class Fibonacci {
    public static int fibonacciNthNumber(int n) {
        int nNumber = 0;
        if(n < 1) return 0;
        if(n == 1) return 1;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            nNumber = a + b;
            a = b;
            b = nNumber;
        }

        return nNumber;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNthNumber(9));
        System.out.println(fibonacciNthNumber(1));
    }
}
