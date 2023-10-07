import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + counter + ": ");
            String firstNumber = scanner.nextLine();

            try {
                double first = Double.parseDouble(firstNumber);
                counter++;
                sum += first;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Value");
            }
        } while (counter <= 5);
        System.out.println("The sum of your numbers is: " + sum);
    }
}


