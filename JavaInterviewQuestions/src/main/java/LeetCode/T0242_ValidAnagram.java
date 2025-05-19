package LeetCode;

import java.util.ArrayList;

public class T0242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> letters = new ArrayList<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }

        for(int i = 0; i < t.length(); i++) {
            if(!letters.contains(t.charAt(i))) return false;
        }
        return true;
    }
}
