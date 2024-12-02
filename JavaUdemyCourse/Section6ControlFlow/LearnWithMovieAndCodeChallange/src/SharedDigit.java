public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(-22, 22));
        System.out.println(hasSharedDigit(4, 54));
        System.out.println(hasSharedDigit(22, 32));
        System.out.println(hasSharedDigit(11, 91));

    }


    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10) || (firstNumber > 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }
        int oneNumberFirstNumber = firstNumber % 10;
        int secondNumberFirstNumber = (firstNumber / 10) % 10;
        int oneNumberSecondNumber = secondNumber % 10;
        int secondNumberSecondNumber = (secondNumber / 10) % 10;

        if ((oneNumberFirstNumber == oneNumberSecondNumber) || (oneNumberFirstNumber == secondNumberSecondNumber) ||
                (secondNumberFirstNumber == oneNumberSecondNumber || (secondNumberFirstNumber == secondNumberSecondNumber))) {
            return true;
        }
        return false;
    }
}
