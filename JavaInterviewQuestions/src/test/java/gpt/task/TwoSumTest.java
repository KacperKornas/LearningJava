package gpt.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] answer = {0,3};
        int[] nums = {1, 1, 2, 4, 8};
        int target = 5;

        assertArrayEquals(answer, twoSum.twoSum(nums, target));
    }
}
