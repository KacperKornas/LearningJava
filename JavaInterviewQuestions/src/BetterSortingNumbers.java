import java.util.Scanner;

public class BetterSortingNumbers {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.giveNumbers();
        sorting.printNumbers();
        sorting.sortNumbers();
        System.out.println();
        sorting.printNumbers();
    }

    static class Sorting {
        int [] numbers = new int[8];
        Scanner scanner = new Scanner(System.in);

        void giveNumbers() {
            for (int i = 0; i < 8; i++) {
                System.out.println("Give me a number: ");
                numbers[i] = (scanner.nextInt());
            }
        }

        void printNumbers() {
            for (int i : numbers) {
            System.out.print(i + " ");
            }
        }

        void sortNumbers() {
            int value;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (numbers[j] > numbers[i]) {
                        value = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = value;
                    }
                }
            }
        }
    }
}


