public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(12340);
        numberToWords(4);
        numberToWords(0);

        System.out.println(reverse(10));
        System.out.println(reverse(0));
        System.out.println(getDigitCount(1234));

    }

    public static void numberToWords(int number) {
        if (number < 0){
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        if (reversedNumber == 0) {
            System.out.println("Zero");
        }

        while (reversedNumber > 0) {
            int lastNumber = reversedNumber % 10;

            switch (lastNumber){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                default:
                    System.out.println("Nine");
                    break;
            };
            reversedNumber /= 10;
        }

        while (originalDigitCount > reversedDigitCount) {
            System.out.println("Zero");
            reversedDigitCount++;
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number = Math.abs(number);
        }

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        if (isNegative) {
            reverseNumber = -reverseNumber;
        }
            return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0){
            return -1;
        }

        int numberOfDigit = 1;

        while (number >= 10) {
            numberOfDigit++;
            number /= 10;
        }
        return numberOfDigit;
    }
}
