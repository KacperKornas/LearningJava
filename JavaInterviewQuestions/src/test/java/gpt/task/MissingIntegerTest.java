package gpt.task;

import codility.MissingInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MissingIntegerTest {

    @Test
    void mInteger() {
        MissingInteger mInt = new MissingInteger();
        assertEquals(2, mInt.findMissingInt(new int[] {3, 3, -1, 1}));
        assertEquals(5, mInt.findMissingInt(new int[] {4, 2, 3, 1}));
        assertEquals(1, mInt.findMissingInt(new int[] {}));
        assertEquals(1, mInt.findMissingInt(new int[] {-3, -3, -1, -1}));
        assertEquals(3, mInt.findMissingInt(new int[] {1, 2, 4, 5}));
    }

}
