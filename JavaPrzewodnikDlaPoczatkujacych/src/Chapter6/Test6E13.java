package Chapter6;

public class Test6E13 {
    public static void main(String[] args) {
        Test6E13 test = new Test6E13();

        System.out.println(test.suma(5, 10, 100, 1000));
    }

    int suma(int ... value) {
        int sum = 0;
        for(int i : value) {
            sum += i;
        }
        return sum;
    }
}
