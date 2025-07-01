package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class T2099_FindSubsequenceOfLengthKWithTheLargestSumTest {

    @Test
    void testT2099() {
        int[] numbers = {3,4,3,3,8,1,3,129,2,1};
        int[] answer = {129,8,4};
        assertArrayEquals(answer, T2099_FindSubsequenceOfLengthKWithTheLargestSum.maxSubsequence(numbers, 3));
    }
}
