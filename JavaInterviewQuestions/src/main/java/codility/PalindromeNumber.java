package codility;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if(0 > x || (x % 10 == 0 && x != 0)) return false;

        int reverse = 0;

        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return x == reverse || x == reverse / 10;
    }
}
