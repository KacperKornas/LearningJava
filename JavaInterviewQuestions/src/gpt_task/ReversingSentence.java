package gpt_task;

import java.util.ArrayList;

public class ReversingSentence {
    public static void main(String[] args) {
        ReversingSentence sentence = new ReversingSentence();
        String str = "To be or not to be, that is the question.";
        System.out.println(str);
        str = sentence.reverse(str);
        System.out.println(str);
    }

    String reverse(String str) {
        StringBuilder newString = new StringBuilder();
        String[] sArray = str.split(" ");
        for (int i = sArray.length - 1; i >= 0; i--) {
            newString.append(sArray[i]);
            newString.append(" ");
        }
        return newString.toString();
    }
}
