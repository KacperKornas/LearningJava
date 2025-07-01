package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T0594_LongestHarmoniousSubsequenceTest {

    @Test
    void testLHS() {
        int[] test1 = {1,3,2,2,5,2,3,7};
        assertEquals(5, T0594_LongestHarmoniousSubsequence.bestLHS(test1));
    }
}
