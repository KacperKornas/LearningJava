package Chapter5;

public class Test5E3 {
    public static void main(String[] args) {
        double[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The avrerage is: " + sum / arr.length);
    }
}
