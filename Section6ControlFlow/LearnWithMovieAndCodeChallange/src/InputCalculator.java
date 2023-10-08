import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int loopCounter = 0;
        double avg = 0;
        long average = 0;

        while (true) {

            try{
                loopCounter++;
                System.out.println("Give me a number: ");
                String number = scanner.nextLine();
                int value = Integer.parseInt(number);
                sum += value;
                avg = (double) sum / loopCounter;
                average = Math.round(avg);
            } catch (NumberFormatException nfs) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}
