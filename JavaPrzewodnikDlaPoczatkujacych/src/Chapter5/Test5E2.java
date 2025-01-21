package Chapter5;

public class Test5E2 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
