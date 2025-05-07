package gpt.task;

import org.junit.jupiter.api.Test;

import static gpt.task.FirstNonRepeatingCharacter2.nonRepeat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstNonRepeatingCharacter2Test {

    @Test
    void nonRepeatTest() {
        assertEquals('l', FirstNonRepeatingCharacter2.nonRepeat("leetcode"));
        assertEquals(' ', FirstNonRepeatingCharacter2.nonRepeat("aabb"));
        assertEquals('c', FirstNonRepeatingCharacter2.nonRepeat("aabbc"));
        assertEquals(' ', FirstNonRepeatingCharacter2.nonRepeat(""));
        assertEquals('l', FirstNonRepeatingCharacter2.nonRepeat("l"));
    }
}
