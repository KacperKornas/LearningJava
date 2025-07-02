package internet;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountWordsInStringTest {
    @Test
    void testCountWords() {
        String text = "To be or not to be, that is the question.";
        HashMap<String, Integer> map = new HashMap<>();

        map.put("the", 1);
        map.put("that", 1);
        map.put("not", 1);
        map.put("be", 2);
        map.put("or", 1);
        map.put("question", 1);
        map.put("is", 1);
        map.put("to", 2);

        assertEquals(map, CountWordsInString.countWords(text));
    }
}