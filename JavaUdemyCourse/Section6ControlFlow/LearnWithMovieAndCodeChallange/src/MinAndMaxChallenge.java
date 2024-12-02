import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minValue = 0;
        int maxValue = 0;
        int loopCount = 0;
        boolean go = true;

        while (go) {
            try {
                loopCount++;
                System.out.println("Give me a number, or any character to quit. ");
                String number = scanner.nextLine();
                int value = Integer.parseInt(number);
                if (loopCount == 1) {
                    minValue = value;
                    maxValue = value;
                } else if (value > maxValue) {
                    maxValue = value;
                } else if (value < minValue) {
                    minValue = value;
                }
            } catch (NumberFormatException nfs) {
                System.out.println("");
                go = false;
            }
        }
        if (loopCount < 1) {
            System.out.println("No valid data entered.");
        } else {
            System.out.println("Your minimum value is " + minValue + ".");
            System.out.println("Your maximum value is " + maxValue + ".");
        }
    }
}
