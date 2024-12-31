import java.util.Scanner;

public class NumberToMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter the number from 1 to 12 or 99 to quit: ");
            number = scanner.nextInt();

                if (number == 99) {
                    System.out.println("\nGoodbye!");
                    break;
                }

            String month = listOfMonth(number);
            System.out.println(STR."\n\{month}\n");
        } while (true);
    }


    public static String listOfMonth(int number) {
        return switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Wrong number!";
        };
    }
}