package from.nowhere;

import java.io.IOException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = scanner.nextInt();

        double factorial = 1;
        for (double i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }
}
