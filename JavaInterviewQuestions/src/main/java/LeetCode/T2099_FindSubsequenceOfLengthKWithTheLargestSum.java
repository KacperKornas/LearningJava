package LeetCode;

import java.util.Arrays;

public class T2099_FindSubsequenceOfLengthKWithTheLargestSum {
    public static int[] maxSubsequence(int[] nums, int k) {
        Integer[] indexes = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, (a, b) -> Integer.compare(nums[b], nums[a]));

        Integer[] chosen = new Integer[k];
        for(int i = 0; i < k; i++) {
            chosen[i] = indexes[i];
        }

        Arrays.sort(chosen);

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = chosen[indexes[i]];
        }

        return answer;
    }
}
