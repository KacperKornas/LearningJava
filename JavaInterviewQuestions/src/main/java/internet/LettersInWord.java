package internet;

import java.util.HashMap;
import java.util.Map;

public class LettersInWord {
    public static void main(String[] args) {
        LettersInWord l = new LettersInWord();
        l.lettersCounter("Incomprehensibilities");
        l.lettersCounter("Checkings Anagrams1");
        l.lettersCounter("hello");
    }

    void lettersCounter(String str) {
        Map<Character, Integer> lList = new HashMap<>();

        str = str.toLowerCase();
        for (char letter : str.toCharArray()) {
            if (Character.isLetter(letter)) {
            lList.put(letter, lList.getOrDefault(letter, 0) +1 );
            }
        }
        System.out.println(lList);
        }
}

