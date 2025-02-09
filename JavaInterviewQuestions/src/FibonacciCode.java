public class FibonacciCode {
    public static void main(String[] args) {
        FibonacciCode f = new FibonacciCode();
        System.out.println(f.fibonacci(30));

    }
    int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return (n-1) + (n-2);
    }
}
