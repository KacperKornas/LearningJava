package leetCode;

public class T0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = nums.length - 1; j > i; j--)
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
