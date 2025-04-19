package internet;

import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        int [] numbers = new int[8];
        int value;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Give me a number: ");
            numbers[i] = (scanner.nextInt());
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (numbers[j] > numbers[i]) {
                        value = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = value;
                }
            }
        }

        System.out.println();

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
