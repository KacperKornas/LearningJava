package LeetCode;

public class T0125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        String respond = s.replaceAll("[^a-zA-Z0-9]", "");
        respond = respond.toLowerCase();

        for(int i = 0; i < s.length()/2; i++) {
            if (respond.charAt(i) == respond.charAt(respond.length() - i - 1)) continue;
            return false;
        }
        return true;
    }
}
