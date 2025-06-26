package gpt.task;

public class Palindrome {
    public boolean isPalindrome(String s) {
        String palindrome = s.toLowerCase();
        palindrome = palindrome.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder reverse = new StringBuilder();

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse.append(palindrome.charAt(i));
        }

        String reversePalindrome = reverse.toString();

        return palindrome.equals(reversePalindrome);
    }
}
