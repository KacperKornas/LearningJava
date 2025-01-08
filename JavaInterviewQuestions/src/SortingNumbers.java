import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        int [] numbers = new int[8];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Give me a number: ");
            numbers[i] = (scanner.nextInt());
        }

        

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
