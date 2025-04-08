import java.util.HashMap;
import java.util.Map;

public class LettersInWord {
    public static void main(String[] args) {
        LettersInWord l = new LettersInWord();
        l.lettersCounter("Incomprehensibilities");
        l.lettersCounter("hello");
    }

    void lettersCounter(String str) {
        Map<Character, Integer> lList = new HashMap<>();
        int counter = 0;
        char letter = ' ';

        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == letter) counter++;
            }
            lList.put(str.charAt(i), counter);
            counter = 0;
        }
        System.out.println(lList);
    }
}
