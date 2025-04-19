package internet;

import java.util.Scanner;

public class FactorialNumbersArray {
    public static void main (String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Give me a number: ");
            arr[i] = scanner.nextInt();
            while (arr[i] <= 0) {
                System.out.println("Give me a number larger than 0: ");
                arr[i] = scanner.nextInt();
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int k : arr) {
            long sum = 1;
            for (int i = 1; i <= k; i++) {
                sum *= i;
            }
            System.out.print(sum + " ");
        }
    }
}
