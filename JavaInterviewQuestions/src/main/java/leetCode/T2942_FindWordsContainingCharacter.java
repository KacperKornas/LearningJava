package leetCode;

import java.util.ArrayList;
import java.util.List;

public class T2942_FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> respond = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(x == words[i].charAt(j)) {
                    respond.add(i);
                    break;
                }
            }
        }
        return respond;
    }
}
