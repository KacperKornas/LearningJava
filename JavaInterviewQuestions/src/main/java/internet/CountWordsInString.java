package internet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountWordsInString {

    public static HashMap countWords(String words) {

        String text = words.replace(",", "");
        text = text.replace(".", "");
        text = text.toLowerCase();
        String[] arr = text.split(" ");

        HashMap<String,Integer> calculateFrequency = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            calculateFrequency.put(arr[i], calculateFrequency.getOrDefault(arr[i], 0) + 1);
        }

        return calculateFrequency;
    }

    public static void main(String[] args) {
        String text = "To be or not to be, that is the question.";
        System.out.println(CountWordsInString.countWords(text));
    }
}
