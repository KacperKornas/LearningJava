package internet;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {

        int j = 1;
        int n = 0;

        System.out.println("Give me the word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        for (int i = 0; i < word.length(); i++, j++) {
            char letter = word.charAt(i);
            if (letter == word.charAt(word.length() - j)) {
                n++;
            }
        }
        if (n == word.length()) {
            System.out.println("This is a palindrome!");
        } else System.out.println("This is not a palindrome.");
    }
}
