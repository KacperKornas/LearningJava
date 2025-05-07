package gpt.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstNonRepeatingCharacterTest {

    @Test
    void testFirstNonRepeating() {
        assertEquals('l', FirstNonRepeatingCharacter.findNonRepeat("leetcode"));
        assertEquals(' ', FirstNonRepeatingCharacter.findNonRepeat("aabb"));
        assertEquals('c', FirstNonRepeatingCharacter.findNonRepeat("aabbc"));
        assertEquals(' ', FirstNonRepeatingCharacter.findNonRepeat(""));
        assertEquals('l', FirstNonRepeatingCharacter.findNonRepeat("l"));
    }
}
