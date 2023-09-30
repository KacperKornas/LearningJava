public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int num = number;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            num /= 10;
        }
        System.out.println(reverse);
        System.out.println(number);
        return number == reverse;
    }
}
