public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sumOfEvenDigits = 0;
        while (number > 0){
            int rest = number % 10;
            if (rest % 2 == 0){
                sumOfEvenDigits += rest;
            }
            number /= 10;
        }
        return sumOfEvenDigits;
    }
}
