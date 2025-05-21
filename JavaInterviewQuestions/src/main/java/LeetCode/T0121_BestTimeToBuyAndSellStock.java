package LeetCode;

public class T0121_BestTimeToBuyAndSellStock {
    public boolean isPalindrome(String s) {
        String converted = s.replaceAll("[^a-zA-Z0-9]", "");
        converted = converted.toLowerCase();

        for (int i = 0; i < converted.length() / 2; i++) {
            if (converted.charAt(i) == converted.charAt(converted.length() - i - 1)) continue;
            return false;
        }
        return true;
    }
}
