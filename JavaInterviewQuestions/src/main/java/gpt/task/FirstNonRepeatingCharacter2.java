package gpt.task;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter2 {

    static char nonRepeat (String str) {
        Map<Character, Integer> chMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            chMap.put(ch, chMap.getOrDefault(ch,0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (chMap.get(ch) == 1) return ch;
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(nonRepeat("eeaakss"));
    }
}
