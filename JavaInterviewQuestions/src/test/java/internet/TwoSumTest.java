package internet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    void testTwoSum() {
        int[] supposed = {0,1};
        int[] nums = {10,4,18,3,5};
        assertArrayEquals(supposed, TwoSum.twoSum(nums, 14));
    }
}
